package app;

public class Car {
	private String color;
	private String marca;
	
	public Car() {}
	
	public Car(String color, String marca) {
		this.color = color;
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
}
