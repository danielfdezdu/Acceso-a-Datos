package pojos;

public class DecoradorArmadura extends EnemigoDecorator {

	public DecoradorArmadura(iEnemigo enemigo) {
		super(enemigo);
	}
	
	@Override
	public double recibeAtaque() {
		// La armadura reduce un 33% el daño recibido
		return enemigo.recibeAtaque() / 1.5;
	}

}
