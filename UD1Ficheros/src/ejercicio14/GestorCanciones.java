package ejercicio14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GestorCanciones {
	private List<Cancion> lista = new ArrayList<Cancion>();
	private List<Cancion> listaSinRepetidos = new ArrayList<Cancion>();

	public List<Cancion> getLista() {
		return lista;
	}

	public void setLista(List<Cancion> lista) {
		this.lista = lista;
	}

	public GestorCanciones(String file) {
		leer(file);
	}

	public void leer(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String[] datos;
			String linea;
			
			while ((linea = br.readLine()) != null) {
				datos = linea.split("\t");
				lista.add(new Cancion(datos[0], datos[1], Integer.parseInt(datos[2]), datos[3]));
			}
		
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());	
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
