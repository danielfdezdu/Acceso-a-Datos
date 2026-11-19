package pojos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import capaNegocio.Bd;

public class User {
	public static boolean validarse(String usuario, String password) {
		try (Connection con = Bd.getConnection("root", "");
			 PreparedStatement stmt = con.prepareStatement(
				"""
			 	   SELECT * 
				   FROM usuarios 
			       WHERE username = ? and password = ?
			    """)){
			stmt.setString(1, usuario);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			return rs.next();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	
//	public static boolean validarse(String usuario, String password) {
//		/*
//		 * Mal. Da pie a usar inyecciones SQL
//		 * 
//		 * usuario= ' or 1=1; -- 
//		 * Si tecleamos este usuario, la sql devuelve todas las 
//		 * filas y la validación sería correcta.
//		 */
//		try (Connection con = Bd.getConnection("root", "");
//			 Statement stmt = con.createStatement();
//			 ResultSet rs = stmt.executeQuery(
//			  "SELECT * " +
//		      "FROM usuarios " +
//			  "WHERE username = '" + usuario + "' " +
//			  "and password = '" + password + "'")){
//			
//			return rs.next();
//			
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
//		return false;
//	}
}