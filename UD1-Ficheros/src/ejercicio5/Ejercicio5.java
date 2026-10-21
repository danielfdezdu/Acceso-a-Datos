package ejercicio5;

import java.io.*;

public class Ejercicio5 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("C:/fog.log"))) {
			
			String linea;
			int numero = 0;
			
			while ((linea = br.readLine()) != null) {
				System.out.println(++numero + " " + linea);
			}
				
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
	}

}

