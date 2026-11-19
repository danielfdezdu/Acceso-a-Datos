package capaNegocio;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Bd {
	public static Connection getConnection(String usuario, String password) {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3306/Northwind", usuario, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	// Ejercicio 13
	
	public static List<String> getTablasYVistas() {
		List<String> res = new ArrayList<String>();
		
		try (Connection con = Bd.getConnection("root", "")) {
			DatabaseMetaData dbmd = con.getMetaData();
			String[] filtro = {"TABLE", "VIEW"};
			
			ResultSet rs = dbmd.getTables(con.getCatalog(), con.getSchema(), "%", filtro);		
			
			while (rs.next()) {
				String nombre = rs.getString("TABLE_NAME");
				String tipo = rs.getString("TABLE_TYPE");
				
				res.add(nombre + " " + tipo);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		
		return res.isEmpty()? null : res;
	}
	
}
