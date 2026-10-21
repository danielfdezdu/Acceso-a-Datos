package ejercicio8;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ejercicio8 {

	public static void main(String[] args) {
		try (MiBufferedReader buffer = new MiBufferedReader(new FileReader("d:"))){
			String linea;
			
			while ((linea = buffer.readLine()) != null)
				System.out.println(linea);
				
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
