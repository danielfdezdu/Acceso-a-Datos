package ejercicio9;

import java.util.Iterator; // OJO! es un interfaz

public class Ejercicio9 {

	public static void main(String[] args) {
		Fichero fichero = new Fichero("c:/fog.log");

		Iterator<String> it = fichero.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
