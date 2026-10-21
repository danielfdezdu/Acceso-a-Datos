package ejercicio7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class DecoradorFiltro extends LectorDecorator {

	private ArrayList<String> palabras;

	public DecoradorFiltro(Lector lector, ArrayList<String> palabras) {
		super(lector);
		this.palabras = palabras;
	}
	
	@Override
	public List<String> leer() {
		List<String> lista = this.lector.leer();
		List<String> resultado = new LinkedList<String>();
		
		for (String linea : lista) {
			for (String palabra : linea.split(" "))
				if (palabras.contains(palabra) ||
					palabras.contains(palabra.toUpperCase()) ||
					palabras.contains(palabra.toLowerCase())) {
					resultado.add(linea);
					break;
				}				
		}
		return resultado;
	}
}
