package pojos;

public class Enemigo implements iEnemigo {

	@Override
	public double recibeAtaque() {
		return 10;
	}
	
	@Override
	public double obtieneVelocidad() {
		return 10;
	}
}
