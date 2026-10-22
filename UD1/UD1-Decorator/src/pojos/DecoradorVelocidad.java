package pojos;

public class DecoradorVelocidad extends EnemigoDecorator {

	public DecoradorVelocidad(iEnemigo enemigo) {
		super(enemigo);
	}
	
	@Override
	public double obtieneVelocidad() {
		// La velocidad se incrementa 5 puntos
		return enemigo.obtieneVelocidad() + 5;
	}

}
