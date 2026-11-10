package app;

import apiRest.ClienteTMDB;

public class Main {
	
	public static void main (String[] args) {
		ClienteTMDB tmdb = new ClienteTMDB();
	
		tmdb.buscarPeliculas("Spiderman").forEach(System.out::println);
	}	
}
