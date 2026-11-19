package pojos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import capaNegocio.Bd;

public class Customer {
	private String customerID;
	private String companyName;
	private String country;
	
	public String getCustomerID() {
		return customerID;
	}
	
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Customer() {}
	
	public Customer(String customerID, String companyName, String country) {
		this.customerID = customerID;
		this.companyName = companyName;
		this.country = country;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [customerID=");
		builder.append(customerID);
		builder.append(", companyName=");
		builder.append(companyName);
		builder.append(", country=");
		builder.append(country);
		builder.append("]");
		return builder.toString();
	}
	
	public void actualizar(Customer cliente) {
		try (Connection con = Bd.getConnection("root", "");
				 PreparedStatement pstmt = con.prepareStatement("""
				 	CREATE PROCEDURE 'actualizaCliente' (clave CHAR(5), nombreEmpresa
				 	VARCHAR(40), nombreContacto VARCHAR(30))
				 	BEGIN
				 		UPDATE customers
				 		SET companyName = nombreEmpresa,
				 			contactName = nombreContacto
				 		WHERE customerID = clave;
				 	END
				 """)) {
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<Customer> getClientesPorPais(String pais, double importe){
		List<Customer> clientes = new ArrayList<>();
		
		try (Connection con = Bd.getConnection("root", "");
			 PreparedStatement pstmt = con.prepareStatement("""
			 	Select c.CustomerID, c.CompanyName, c.Country
			 	From Customers c inner join Orders o on c.CustomerID = o.CustomerID
			 	inner join OrderDetails od on o.OrderId = od.OrderID
			 	Group by CustomerID 
			 	Having c.country = ? and sum(od.total) >= ?
			 """)) {
			
			pstmt.setString(1, pais);
			pstmt.setDouble(2, importe);
			
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
				clientes.add(new Customer(rs.getString(1), rs.getString(2), rs.getString(3)));
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return clientes.isEmpty()? null: clientes;
	}
}
