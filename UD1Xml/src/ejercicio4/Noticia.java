package ejercicio4;

import java.time.LocalDateTime;

public class Noticia {
	private String titulo;
	private String autor;
	private int categoria;
	private LocalDateTime fecha;
	
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
	
	public int getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public LocalDateTime getFecha() {
		return fecha;
	}
	
	public void setFecha(LocalDateTime localDateTime) {
		this.fecha = localDateTime;
	}

	public Noticia(String titulo, String autor, String categoria, LocalDateTime fecha) {
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
