package app;

import pojos.*;

public class Main {

	public static void main(String[] args) {
		iEnemigo enemigo = new Enemigo();
		
		enemigo = new DecoradorCasco(enemigo);
		enemigo = new DecoradorArmadura(enemigo);
		enemigo = new DecoradorVelocidad(enemigo);
		enemigo = new DecoradorVelocidad(enemigo);
		enemigo = new DecoradorVelocidad(enemigo);
		
		System.out.println(enemigo.recibeAtaque());
		System.out.println(enemigo.obtieneVelocidad());
	}

}
