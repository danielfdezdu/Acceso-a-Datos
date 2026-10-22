package ejercicio6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio6 {
	
	private static long getNumeroLineas(String file) {		
		long contador = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//			while (br.readLine() != null)
//				contador++;
			contador = br.lines().count();
						
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero " + file);
		} catch (IOException e) {
			System.out.println("Error E/S leyendo el fichero" + file);
		}
			return contador;
	}
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		if (args.length < 1) {
			System.out.println("Se necesita recibir una o más");
			return;
		}
		
		for (String s: args) {
			System.out.println(s + ": " + getNumeroLineas(s) + " líneas.");
		}
		
	}

}
