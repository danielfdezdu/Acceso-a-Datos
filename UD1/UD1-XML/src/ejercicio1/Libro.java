package ejercicio1;

public class Libro {
	private String id;
	private String titulo;
	private String autor;
	private String categoria;
	private int anio;
	private double precio;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Libro() {}

	public Libro(String id, String titulo, String autor, String categoria, int anio, double precio) {
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.anio = anio;
		this.precio = precio;
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", autor=" + autor + ", anio=" + anio + ", precio=" + precio
				+ "]";
	}
	
}
