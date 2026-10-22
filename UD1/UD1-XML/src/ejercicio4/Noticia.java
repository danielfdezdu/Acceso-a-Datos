package ejercicio4;

import java.time.LocalDateTime;

public class Noticia {
	public String titulo;
	public String autor;
	public String link;
	public String categoria;
	public LocalDateTime fechaPublicacion;
	
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
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getCategoria() {
		return categoria;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public LocalDateTime getFechaPublicacion() {
		return fechaPublicacion;
	}
	
	public void setFechaPublicacion(LocalDateTime fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Noticia [titulo=");
		builder.append(titulo);
		builder.append(", autor=");
		builder.append(autor);
		builder.append(", link=");
		builder.append(link);
		builder.append(", categoria=");
		builder.append(categoria);
		builder.append(", fechaPublicacion=");
		builder.append(fechaPublicacion);
		builder.append("]");
		return builder.toString();
	}

}

