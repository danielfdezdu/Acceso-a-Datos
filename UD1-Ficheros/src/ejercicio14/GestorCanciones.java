package ejercicio14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class GestorCanciones {
	private List<Cancion> lista = new ArrayList<Cancion>();
	
	public GestorCanciones(String file) {
		leer(file);
		eliminarDuplicados();
	}
	
	private void leer(String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))){
			String[] datos;
			String linea;
			
			while ((linea = br.readLine()) != null) {
				datos = linea.split("; ");
				lista.add(new Cancion(datos[0], datos[1], Integer.parseInt(datos[2].trim()), datos[3]));
			}
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
	
	public List<Cancion> getLista(){
		return this.lista;
	}
	
	public void eliminarDuplicados(){
		LinkedHashSet<Cancion> set = new LinkedHashSet<>();
		
		lista.forEach(set::add);
		lista.clear();
		//set.forEach(lista::add);
		lista.addAll(set);
	}
	
	// Método Factory!!!
	public PlayList crearPlayList(String tipo) {
		return switch(tipo.toUpperCase()) {
			case "ROCK" -> new PlayListRock(lista);
			case "POP" -> new PlayListPop(lista);
			case "MIX" -> new PlayListMix(lista);
			default -> 
			  throw new IllegalArgumentException("Tipo de playlist no válido: " + tipo);
		};
	}
	
	
}






















