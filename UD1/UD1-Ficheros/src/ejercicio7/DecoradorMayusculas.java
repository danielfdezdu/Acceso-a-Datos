package ejercicio7;

import java.util.List;

public class DecoradorMayusculas extends LectorDecorator {

	public DecoradorMayusculas(Lector lector) {
		super(lector);
	}
	
	@Override
	public List<String> leer() {
		List<String> lista = this.lector.leer();
		
		return lista
			.stream()
			.map(String::toUpperCase)
			.toList();
	}

}
