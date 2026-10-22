package pojos;

public class Empleado {
	
	private int clave;
	private String nombre;
	private double salario;
	private double incremento;
	
	public Empleado(int clave, String nombre, double salario) throws Exception {
		this.clave = clave;
		this.setNombre(nombre);
		this.salario = salario;
	}

	public void setNombre(String nombre) throws Exception {
		if (nombre.length() <= 20)
			this.nombre = nombre;
		else
			throw new Exception("El nombre no puede tener más de 20 caracteres");
	}

	public double getSalario() {
		return salario;
	}
	
	public void incrementaSalario(double incremento) {
		this.salario *= incremento;
	}

	public String nombreAMayusculas() {
		return this.nombre = nombre.toUpperCase();
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [clave=");
		builder.append(clave).append(", nombre=");
		builder.append(nombre).append(", salario=");
		builder.append(salario);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
