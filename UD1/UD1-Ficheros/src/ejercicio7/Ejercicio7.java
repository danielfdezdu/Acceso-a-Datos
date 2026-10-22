package ejercicio7;

import java.util.ArrayList;

public class Ejercicio7 {

	public static void main(String[] args) {
		if (args.length == 0) {
			System.out.println("Debe indicar el nombre de un fichero.");
			System.exit(-1);
		}
		
		boolean convertir = args.length > 1 && args[1].equals("-M");
		
		ArrayList<String> palabras = new ArrayList<>();
		int desde = convertir? 2 : 1;
			for (int i = desde; i < args.length; i++)
				palabras.add(args[i]);
			
			Lector lector = new LectorFichero(args[0]);
			lector = new DecoradorMayusculas(lector);
			lector = new DecoradorFiltro(lector, palabras);
			
			lector.leer().forEach(System.out::println);
	}
		
}


