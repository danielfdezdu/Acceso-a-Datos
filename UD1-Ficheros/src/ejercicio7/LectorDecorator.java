package ejercicio7;

public abstract class LectorDecorator implements Lector {
	
	protected Lector lector; // Clase que decoramos
	
	public LectorDecorator (Lector lector) {
		this.lector = lector;
	}
}
