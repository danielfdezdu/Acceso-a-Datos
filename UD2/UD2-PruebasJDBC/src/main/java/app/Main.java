package app;

import pojos.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	
	private static boolean validacion() {
		final int MAX = 3;
		
		Scanner in = new Scanner(System.in);
		String usuario;
		String password;
		boolean validacionOK = false;
		int contador = 0;
		
		do {
			System.out.println("Usuario: ");
			usuario = in.nextLine();
			System.out.println("Contraseña: ");
			password = in.nextLine();
			
			validacionOK = Usuario.validarse(usuario, password);
			if (!validacionOK)
				System.out.println();
			contador++;
		} while (!validacionOK && contador <= MAX);
		
		return validacionOK;
	}

	public static void main(String[] args) {
//		String url = "jdbc:mysql://localhost:3306/Northwind";
//		String usuario = "root";
//		String password = "";
		
		// Prueba
		
//		try (Connection con = DriverManager.getConnection(url, usuario, password);
//				Statement stmt = con.createStatement();	
//				ResultSet rs = stmt.executeQuery("""
//					SELECT CompanyName
//					FROM Customers
//				""")
//			){
//			
//			
//			while (rs.next()) {
//				System.out.println(rs.getString(1));
//			}
//			
//		} catch (SQLException e) {
//			System.out.println(e.getMessage());
//		}
		
		
		// Ejercicio 1
		
//		Empleados empleados = new Empleados();
//		empleados.leer();
//		empleados.forEach(System.out::println);
		
		// Ejercicio 2
		
		if (!validacion()) {
			System.out.println("Error de validación");
			System.exit(-1);
		}

	}

}
