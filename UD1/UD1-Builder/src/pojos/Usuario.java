package pojos;

public class Usuario {
	private String email;
	private String nombre;
	private String apellidos;
	private String telefono;
	private String direccion;
	
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
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
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Usuario [email=")
				.append(email).append(", nombre=")
				.append(nombre)
				.append(", apellidos=")
				.append(apellidos).append(", telefono=").append(telefono).append(", direccion=").append(direccion)
				.append("]");
		return builder.toString();
	}
	
	public int getHash() {
		return this.hashCode();
	}
	
}