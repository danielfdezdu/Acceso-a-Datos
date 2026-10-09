package ejercicio9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Fichero implements Iterable<String> {
	public List<String> lineas = new ArrayList<>();
	
	public Fichero (String file) {
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			
			lineas = br.lines().collect(Collectors.toList());
			
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public Fichero(File file) {
		this(file.getPath());
	}

	@Override
	public Iterator<String> iterator() {
		
		return new Iterador();
	}
	
	private class Iterador implements Iterator<String> {

		// Última línea devuelta
		private int id = 0;
		
		@Override
		public boolean hasNext() {
			return id < lineas.size();
		}

		@Override
		public String next() {
			if (!hasNext())
				throw new NoSuchElementException();
			
			return lineas.get(id++);
		}
	}
}
	

