package pojos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.ArrayList;

import capaNegocio.Bd;

public class Employees extends ArrayList<Employee>{
	public void leer() {
		try (Connection con = Bd.getConnection("root", "");
			 Statement stmt = con.createStatement();
			 ResultSet rs = stmt.executeQuery("""
			 	SELECT 	employeeID,
			 			LastName,
			 			FirstName
			 	FROM employees 
			 """)) {
			
			this.clear();
			while (rs.next()) 
				this.add(new Employee(
								rs.getInt("employeeID"),
								rs.getString("LastName"),
								rs.getString("FirstName")
							 )
						);
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static int getEmpleadosPorPais(String pais) {
		int contador = -1;
		
		try (Connection con = Bd.getConnection("root", "");
			 CallableStatement cstmt = con.prepareCall(
				"{call EmpleadosPorLugarTrabajo(?, ?)}"
			 )){
			cstmt.setString(1, pais);
			cstmt.registerOutParameter(2, Types.INTEGER);
			cstmt.execute();
				
			contador = cstmt.getInt(2);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return contador;
	}
	
	public static int getEmpleadosPorPais2(String pais) {
		int contador = -1;
		
		try (Connection con = Bd.getConnection("root", "");
			 CallableStatement cstmt = con.prepareCall(
				"{? = call numeroEmpleadosPorPais(?)}"
			 )){
			cstmt.registerOutParameter(1, Types.INTEGER);
			cstmt.setString(2, pais);
			
			cstmt.execute();
				
			contador = cstmt.getInt(1);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return contador;
	}
}