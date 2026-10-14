package ejercicio14;

public class Cancion {
	private String titulo;
	private String grupo;
	private int duracion;
	private String genero;
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public String getGrupo() {
		return grupo;
	}
	
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	
	public int getDuracion() {
		return duracion;
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero.trim();
	}

	public Cancion(String titulo, String grupo, int duracion, String genero) {
		this.titulo = titulo;
		this.grupo = grupo;
		this.duracion = duracion;
		this.genero = genero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Cancion [titulo=");
		builder.append(titulo);
		builder.append(", grupo=");
		builder.append(grupo);
		builder.append(", duracion=");
		builder.append(duracion);
		builder.append(", genero=");
		builder.append(genero);
		builder.append("]");
		return builder.toString();
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		
		if (!(o instanceof Cancion))
			return false;
		
		return this.getTitulo().equalsIgnoreCase(((Cancion)o).getTitulo()) &&
			   this.getGrupo().equalsIgnoreCase(((Cancion)o).getGrupo());
	}
	
	@Override
	public int hashCode() {
		return titulo.hashCode() * 31 + grupo.hashCode();
	}
}