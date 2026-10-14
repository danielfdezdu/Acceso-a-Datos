package Ejercicio14;

public class Main {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Debe indicar el fichero con las canciones.");
			System.exit(-1);
		}
		
		GestorCanciones gestor = new GestorCanciones(args[0]);
		PlayList playlist = gestor.crearPlayList("mix");
		playlist.generar();
		
		playlist.getLista().forEach(System.out::println);
		try {
			playlist.guardar("D:/alberto/playlist.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
