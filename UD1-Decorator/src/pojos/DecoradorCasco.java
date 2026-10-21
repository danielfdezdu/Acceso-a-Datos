package pojos;

public class DecoradorCasco extends EnemigoDecorator {

	public DecoradorCasco(iEnemigo enemigo) {
		super(enemigo);	
	}
	
	@Override
	public double recibeAtaque() {
		// El casco reduce en un 50% el daño recibido
		return enemigo.recibeAtaque() / 2;
	}
	
}
