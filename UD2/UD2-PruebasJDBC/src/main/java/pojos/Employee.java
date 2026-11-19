package pojos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import capaNegocio.Bd;

public class Employee {
	private int employeeID;		
	private String lastName;
	private String firstName;
	
	public int getEmployeeID() {
		return employeeID;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Employee() {};
	
	public Employee(String lastName, String firstName) {
		this.lastName = lastName;
		this.firstName = firstName;
	}
	
	public Employee(int employeeId, String lastName, String firstName) {
		this.employeeID = employeeId;
		this.lastName = lastName;
		this.firstName = firstName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [EmployeeID=");
		builder.append(employeeID);
		builder.append(", LastName=");
		builder.append(lastName);
		builder.append(", FirstName=");
		builder.append(firstName);
		builder.append("]");
		return builder.toString();
	}
	
	public void darBaja() {
		try (Connection con = Bd.getConnection("root", "");
				 PreparedStatement pstmt = con.prepareStatement("""
				 	DELETE FirstName, LastName FROM employees WHERE employeeID
				 """)) {
			
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void grabar() {
		// Se debería controlar que la clase dispone de los datos necesarios.
		try (Connection con = Bd.getConnection("root", "");
			 PreparedStatement pstmt = con.prepareStatement("""
			 	Insert into employees
			 	(FirstName, LastName)
			 	Values
			 	(?, ?)
			 """, Statement.RETURN_GENERATED_KEYS)) {

			pstmt.setString(1, this.firstName);
			pstmt.setString(2, this.lastName);
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			this.employeeID = rs.getInt(1);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void grabar2() {
		// Se debería controlar que la clase dispone de los datos necesarios.
		try (Connection con = Bd.getConnection("root", "");
			 PreparedStatement pstmt = con.prepareStatement("""
			 	Insert into employees
			 	(FirstName, LastName)
			 	Values
			 	(?, ?)
			 """, Statement.RETURN_GENERATED_KEYS)) {

			pstmt.setString(1, this.firstName);
			pstmt.setString(2, this.lastName);
			pstmt.executeUpdate();
			
			ResultSet rs = pstmt.getGeneratedKeys();
			rs.next();
			this.employeeID = rs.getInt(1);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

}