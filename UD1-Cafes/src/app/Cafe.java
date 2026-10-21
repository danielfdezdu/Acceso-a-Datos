package app;

public class Cafe {
	
	private String nombre;
	private double precio;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public Cafe() {}
	
	public Cafe(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	
	@Override
	public String toString() {
		return "Cafe [nombre=" + nombre + ", precio=" + precio + "]";
	}	
	
}
