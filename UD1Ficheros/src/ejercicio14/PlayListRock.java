package ejercicio14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayListRock implements PlayList{

	private List<Cancion> lista;
	
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
		int n = 0;
		int duracionTotal = 0;
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			
			bw.write("PLAYLIST ROCK\n");
			bw.write("====================================================\n");
		
			for(Cancion c: lista) {
				bw.write(++n + ". " + c.getTitulo() + " - " + c.getGrupo() + "\n");
				bw.write("Duración: " + c.getDuracion() + "\n");
				bw.write("Estilo: ROCK\n\n");
				
				duracionTotal += c.getDuracion();
			}
			
			bw.write("====================================================\n");
			bw.write("Número de canciones: " + n + "\n");
			bw.write("Duración total: " + duracionTotal + " segundos\n");
			
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}

	@Override
	public List<Cancion> getLista() {
		return lista;
	}

}