package app;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import capaNegocio.Bd;
import pojos.*;

public class Main {

	private static boolean validacion() {
		final int MAX = 3;

		Scanner in = new Scanner(System.in);
		String usuario;
		String password;
		boolean validacionOK = false;
		int contador = 0;
		
		do {
			System.out.print("Usuario: ");
			usuario = in.nextLine();
			System.out.print("Contraseña: ");
			password = in.nextLine();
		
			validacionOK = User.validarse(usuario, password);
			if (!validacionOK)
				System.out.println("Validacion incorrecta");
			contador++;
		} while (!validacionOK && contador < MAX);
		
		return validacionOK;
	}
	
	public static void main(String[] args) {
		
		// Ejercicio 1
		
//		Employees empleados = new Employees();
//		empleados.leer();
//		empleados.forEach(System.out::println);
		
		// Ejercicio 2
		
//		if (!validacion()) {
//			System.out.println("Error de validación");
//			System.exit(-1);
//		}
		
		// Ejercicio 3
		
//		Customer.getClientesPorPais("USA", 1000).forEach(System.out::println);
		
		// Ejercicio 4
		
//		System.out.println(Employees.getEmpleadosPorPais("Spain"));
//		System.out.println(Employees.getEmpleadosPorPais2("USA"));
		
		// Ejercicio 5
		
//		Employee e = new Employee("Carla", "Víñez");
//		e.grabar();
//		System.out.println(e);
		
		// Ejercicio 6
		
//		Employee e = new Employee("Carla", "Víñez");
//		e.grabar2();		
		
		// Ejercicio 7
		
		
		
		// Ejercicio 8
		
//		Employee e = new Employee("", "");
//		e.darBaja();
		
		// Ejercicio 9
		
//		Customer c = new Customer("", "", "");
//		c.actualizar(c);
		
		// Ejercicio 10
		
		// Ejemplo Metadatos
		
//		try (Connection con = Bd.getConnection("root", "")) {
//			DatabaseMetaData dbmd = con.getMetaData();
//			if (dbmd == null)
//				System.out.println("La base de datos no ofrece metadatos");
//			else {
//				if (dbmd.supportsTransactions()) {
//					System.out.println("Soporta transacciones");
//				} else {
//					System.out.println("No soporta transacciones");
//				}
//			}
//			
//		} catch (SQLException e) {
//				System.out.println(e.getMessage());
//		}
		
		// Ejercicio 13
		
		Bd.getTablasYVistas().forEach(System.out::println);
	
	}

}
