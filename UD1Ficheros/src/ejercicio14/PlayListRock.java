package ejercicio14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayListRock implements PlayList {
	
	List<Cancion> lista;
	
	public PlayListRock(List<Cancion> lista) {
		this.lista = lista;
	}
	
	@Override
	public void generar() {
		List<Cancion> playlist = new ArrayList<>();
		int duracionTotal = 0;
		
		for (Cancion cancion: lista) {
			if (duracionTotal == 3600)
				break;
			
			if (cancion.getGenero().equalsIgnoreCase("Rock") &&
				duracionTotal + cancion.getDuracion() <= 3_600) {
					playlist.add(cancion);
					duracionTotal += cancion.getDuracion();
			}
		}
		
		lista = playlist;
	}

	@Override
	public void guardar(String file) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
