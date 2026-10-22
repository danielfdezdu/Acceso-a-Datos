package main;

import pojos.*;

public class Main {

	public static void main(String[] args) {
		Usuario usuario = new UsuarioBuilder().email("correo.gmail.com")
											  .nombre("Luis")
											  .apellidos("López")
											  .direccion("Rúa Percebe, 13")
											  .telefono("56473345")
											  .build();
		
		System.out.println(usuario);
		System.out.println(usuario.getHash());


	}

}
