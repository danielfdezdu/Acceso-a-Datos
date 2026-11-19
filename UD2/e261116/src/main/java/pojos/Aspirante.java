package pojos;

public class Aspirante {
	private int id;
	private String nombre;
	private String apellidos;
	private double notaMedia;
	
	private Aspirante() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public double getNotaMedia() {
		return notaMedia;
	}
	public void setNotaMedia(double notaMedia) {
		this.notaMedia = notaMedia;
	}
	
	public boolean compareTo(Aspirante otro) {
		if(otro.notaMedia < notaMedia) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public String toString() {
		return "Aspirante [id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", notaMedia=" + notaMedia
				+ "]";
	}
	
}
