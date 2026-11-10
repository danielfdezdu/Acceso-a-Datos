package capaNegocio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd {

	public static Connection getConnection(String usuario, String password) {
		Connection con;
		try {
			return DriverManager.getConnection(usuario, password);
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
}
