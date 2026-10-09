package Main;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.HashMap;
import pojos.Alumno;
import pojos.Streams;

public class Ejercicios {
	
	public static void main(String[] args) {
		
//	1.			
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//		.forEach(e -> System.out.println(e))
//		.forEach(System.out.println::println);
	
//	2.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(e -> e.getNombre().startsWith("L") || e.getNombre().startsWith("G"))
//			.forEach(e -> System.out.println(e));
		
//	3.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		System.out.println(alumnos.stream().count());
		
//	4.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(e -> e.getNota() > 9 && e.getNombreCurso().equals("PHP"))
//			.forEach(System.out::println);
		
//	5.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.limit(5)
//			.forEach(e -> System.out.println(e));
		
//	6.	
//		List<Alumno> alumnos = Streams.getAlumnos();
//		int edadMaxima = alumnos.stream()
//			.mapToInt(Alumno::getEdad)
//			.max()
//			.orElse(0);
//		System.out.println(edadMaxima);
//		alumnos
//			.stream()
//			.filter(e -> e.getEdad() == edadMaxima)
//			.forEach(System.out::println);
	
//	7.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		System.out.println(alumnos.stream().findFirst());
		
// 	8.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(a -> a.getNombreCurso().endsWith("t"));
//		forEach(System.out::println);
		
//	9.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.filter(a -> a.getNombreCurso().contains("a"))
//			.forEach(System.out::println);
	
//	10.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombres = alumnos.stream()
//			.map(Alumno::getNombre)
//			.toArray(String[]::new);
//		
//		for(String nombre: nombres)
//			System.out.println(nombre);
		
//	11.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombresCompletos = alumnos.stream()
//			.map(a -> a.getNombre() + " " + a.getApellidos())
//			.sorted()
//			.toArray(String[]::new);
//		for(String nombre: nombresCompletos)
//			System.out.println(nombre);
	
//	12.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean existe = alumnos.stream()
//			.anyMatch(a -> a.getNota() == 10);
//		System.out.println(existe);
	
//	13.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean existe = alumnos.stream()
//			.anyMatch(a -> a.getNota() > 9 && a.getNombreCurso().equals("PHP"));
//		System.out.println(existe);
		
//	14.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean todosAprobados = alumnos.stream()
//			.allMatch(a -> a.getNota() >= 5);
//		System.out.println(todosAprobados);
		
//	15.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		boolean ningunoSuspenso = alumnos.stream()
//			.allMatch(a -> a.getNota() < 5);
//		System.out.println(ningunoSuspenso);
		
// 	16.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] palabras = alumnos.stream()
//			.map(a -> a.getNombre() + " " + a.getApellidos())
//			.flatMap(nombreCompleto -> Arrays.stream(nombreCompleto.split(" "))
//			.distinct()
//			.collect(Collector.toList());
		
//	17.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		List<Alumno> lista = alumnos.stream()
//			.filter(a -> a.getNombreCurso().contains("a"));
//			.collect(Collectors.toList());
//		
//		lista.forEach(System.out::println);
			
//	18.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		List<Alumno> lista = alumnos.stream()
//			.map(e -> e.getNombre().toUpperCase())
//			.collect(Collectors.toList());
//		
//		lista.forEach(System.out::println);
		
//	19.
//		List<Alumno> alumnos = Streams.getAlumnos();
//			.map(a -> a.getNombre())
//			.sorted()
//			.collect(Collectors.toList());
//		
//		lista.forEach(System.out::println);

//	20.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		Map<String, Double> notas = new HashMap<>(); 
//		notas.put("Carla", 9.2);
//		notas.put("Marcos", 0.0);
//		notas.put("Jorge", 0.5);
//		notas.put("Hugo", 0.0);
//
//		List<String> lista = notas.entrySet().stream()
//			.filter(a -> a.getValue() >= 5)
//			.map(Map.Entry::getKey))
//		
//		lista.forEach(System.out::println);
		
//	21.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombres = alumnos.stream()
//				.map(a -> a.getNombre())
//				.toArray(String[]::new);
//		
//		for(String nombre: nombres)
//			System.out.println(nombre);
				
//	22.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		String[] nombres = alumnos.stream()
//				.map(a -> a.getNombre() + " " + a.getApellidos())
//				.toArray(String[]::new);
//		
//		for(String nombre: nombres)
//			System.out.println(nombre);
		
//	23.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.peek(a -> System.out.println("Antes del filtro: " + a.getNombre()))
//			.filter(a -> a.getNota() > 7)
//			.peek(a -> System.out.println("Después del filtro: " + a.getNombre()))
//			.forEach(System.out::println);
		
//	24.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//			.map(Alumno::getNombreCurso)
//			.distinct()
//			.forEach(System.out::println);
		
//	25.
//		List<Alumno> alumnos = Streams.getAlumnos();
//		alumnos.stream()
//		.map(a -> {
//			String[] apellidos = a.getApellidos().split(" ");
//			String nombre = a.getNombre();
//			
//			String parte1 = apellidos.length > 0?
//				apellidos[0].substring(0, Math.min(3, apellidos[0].length())) : "";
//			String parte2 = apellidos.length > 0?
//				apellidos[1].substring(0, Math.min(3, apellidos[1].length())) : "";
//			String parte3 = nombre.length() > 0?
//				nombre.substring(0 , Math.min(3, nombre.length())) : "";
//			return parte1 + parte2 + parte3;
//		})
//		.forEach(System.out::println);
		
	}
}
