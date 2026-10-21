package pojos;

public class UsuarioBuilder {
	private Usuario usuario = new Usuario();
	
	public UsuarioBuilder email(String email) {
		usuario.setEmail(email);
		
		return this;
	}
	
	public UsuarioBuilder nombre(String nombre) {
		usuario.setNombre(nombre);
		
		return this;
	}
	
	public UsuarioBuilder apellidos(String apellidos) {
		usuario.setApellidos(apellidos);
		
		return this;
	}
	
	public UsuarioBuilder telefono(String telefono) {
		usuario.setTelefono(telefono);
		
		return this;
	}
	
	public UsuarioBuilder direccion(String direccion) {
		usuario.setDireccion(direccion);
		
		return this;
	}
	
	public Usuario build() {
		return usuario;
	}
	
}
