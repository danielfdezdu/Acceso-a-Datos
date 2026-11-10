package pojos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import capaNegocio.Bd;

public class Empleados extends ArrayList<Empleado>{
	public void leer() {
		
		try (Connection con = Bd.getConnection("root", "");
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("""
				SELECT employeeID,
					   LastName,
					   FirstName
				FROM employees
			""")) {
			
			this.clear();
			while (rs.next()) {
				this.add(new Empleado(
						rs.getInt("employeeID"),
						rs.getString("LastName"),
						rs.getString("FirstName")
						)
					);
			}
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
}
