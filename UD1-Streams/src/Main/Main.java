package Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pojos.Empleado;

public class Main {

	public static void main(String[] args) throws Exception {
		Stream<Empleado> stream = Stream.of(
				new Empleado(1, "Jeff Bezos", 100_000),
				new Empleado(2, "Bill Gates", 200_000),
				new Empleado(3, "Mark Zukenberg", 300_000),
				null
			);
			
			stream
				.filter(e -> e != null)
				.filter(e -> e.getSalario() >= 200_000)
				.forEach(System.out::println);
		
//		List<String> alpha = Arrays.asList("a", "b", "c", "d");
//		
//		alpha.stream() // obtengo un string
//			.map(String::toUpperCase)
//			.filter(e -> e.compareTo("c") == 1)
//			.collect(Collectors.toList()) // convierte la lista en el tipo de datos que le indique
//			.forEach(System.out::println);
		
//		Stream<Empleado> stream = Stream.of(
//			new Empleado(1, "Jeff Bezos", 100_000),
//			new Empleado(2, "Bill Gates", 200_000),
//			new Empleado(3, "Mark Zukenberg", 300_000)
//		);
//		
//		stream.forEach(e -> e.incrementaSalario(1.1)); No se puede porque consume los datos.
//		stream.forEach(e -> System.out.println(e));
//		stream
//			.map(e -> e.nombreAMayusculas())
//			.forEach(System.out::println); //Pasa de un dato a otro
		
	}
}
