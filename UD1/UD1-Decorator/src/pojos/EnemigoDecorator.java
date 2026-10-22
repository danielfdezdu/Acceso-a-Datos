package pojos;

public abstract class EnemigoDecorator implements iEnemigo {
	
	protected iEnemigo enemigo;
	
	public EnemigoDecorator (iEnemigo enemigo) {
		this.enemigo = enemigo;
	}
	
	@Override
	public double recibeAtaque() {
		return enemigo.recibeAtaque();
	}
	
	@Override
	public double obtieneVelocidad() {
		return enemigo.obtieneVelocidad();
	}
}
