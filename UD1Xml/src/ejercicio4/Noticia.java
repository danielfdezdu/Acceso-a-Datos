package ejercicio4;

public class Noticia {
	private String titulo;
	private String autor;
	private String categoria;
	private String fecha;
	
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
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Noticia(String titulo, String autor, String categoria, String fecha) {
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Noticia [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", fecha=" + fecha + "]";
	}
	
}
