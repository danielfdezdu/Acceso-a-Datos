package ejercicio14;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlayListPop implements PlayList{

	private List<Cancion> lista;
	
	public PlayListPop(List<Cancion> lista) {
		this.lista = lista;
	}
	
	@Override
	public void generar() {
		List<Cancion> playlist = new ArrayList<>();
		int duracionTotal = 0;
		
		for (Cancion cancion: lista) {
			if (playlist.size() == 15 || duracionTotal == 2_700)
				break;
			
			if (cancion.getGenero().equalsIgnoreCase("Pop") &&
				duracionTotal + cancion.getDuracion() <= 2_700) {
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
			
			bw.write("PLAYLIST POP\n");
			bw.write("====================================================\n");
		
			for(Cancion c: lista) {
				bw.write(++n + ". " + c.getTitulo() + " - " + c.getGrupo() + "\n");
				bw.write("Duración: " + c.getDuracion() + "\n");
				bw.write("Estilo: POP\n\n");
				
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