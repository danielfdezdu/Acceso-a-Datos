package ejercicio14;

import java.util.List;

public class Ejercicio14 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Debe indicar el fichero con las canciones.");
			System.exit(-1);
		}
		
		GestorCanciones gestor = new GestorCanciones(args[0]);
		
		List<Cancion> lista = gestor.getLista();
		
		System.out.println(lista.size());
	}

}