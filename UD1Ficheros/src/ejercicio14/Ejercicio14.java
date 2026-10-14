package ejercicio14;

public class Ejercicio14 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Debe indicar el fichero con las canciones.");
			System.exit(-1);
		}
		
		GestorCanciones gestor = new GestorCanciones(args[0]);
		PlayList playlist = gestor.crearPlayList("Pop");
		playlist.generar();
		
		playlist.getLista().forEach(System.out::println);
		try {
			playlist.guardar("D:/Daniel_Fernandez/Acceso-a-Datos-2DAM/UD1Ficheros/src/ejercicio14/Canciones.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}