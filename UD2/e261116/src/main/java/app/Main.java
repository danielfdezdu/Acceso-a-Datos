package app;

import java.io.IOException;
import java.util.Map;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import pojos.*;

public class Main {

	// Ejercicio 2. Mostrar los resultados de las pruebas.
	private static void mostrarResultados(Convocatoria convocatoria) {
	    try {
	        Map<Integer, Map<Integer, Double>> resultados = convocatoria.getResultados();

	        for (Integer idPrueba : resultados.keySet()) {

	            System.out.println("Prueba: " + idPrueba);

	            Map<Integer, Double> calificaciones = resultados.get(idPrueba);

	            for (Integer idAlumno : calificaciones.keySet()) 
	                System.out.println("   Aspirante: " + idAlumno
	                        + " - Nota: " + calificaciones.get(idAlumno));
	        }

	    } catch (Exception e) {
	        System.out.println("Error al leer los resultados: " + e.getMessage());
	    }
	}
	
	private static void mostrarProfesores(Convocatoria convocatoria) {
		// Completar
    }
	
	private static void mostrarAspirantes(List<Aspirante> aspirantes) {
		for (Aspirante aspirante : aspirantes)
	        System.out.println(
	        	aspirante.getId() + " - " +
	            aspirante.getNombre() + " " +
	            aspirante.getApellidos() + " - " +
	            aspirante.getNotaMedia());
	}
	
	public static void main(String[] args) {

		Convocatoria convocatoria = new Convocatoria("Convocatoria curso 27-28");
		
		// Ejercicio 1.
		// Lectura del fichero aspirantes.txt y volcado de la información a la clase Convocatoria
		try {
			convocatoria.leerAspirantes("datos/aspirantes.txt");
			convocatoria.getAspirantes().forEach(System.out::println);
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// Ejercicio 2
		// Lectura del fichero calificaciones.xml
		try {
			convocatoria.leerResultados("datos/calificaciones.xml");
			mostrarResultados(convocatoria);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			System.out.println(e.getMessage());
		}
		
		// Ejercicio 3
		// Calcular nota media por aspirante y ordenar todos los aspirantes por nota.
		convocatoria.ordenarAspirantesPorNotaMedia();
		mostrarAspirantes(convocatoria.getAspirantes());
	    
	    
	    // Ejercicio 4
	    // Almacenar en un fichero de texto los aspirantes ordenados por nota de acceso
	    try {
	        convocatoria.guardarClasificacion("datos/clasificacion.txt");
	        System.out.println("Clasificación guardada correctamente.");
	    } catch (IOException e) {
	        System.out.println("Error al guardar la clasificación.");
	    }
	    
	    // Ejercicio 5
	    // Leer fichero JSON y mostrar las pruebas que supervisa cada profesor
	    try {
            convocatoria.leerProfesores("datos/profesores.json");
            mostrarProfesores(convocatoria);
        } catch (IOException e) {
            System.out.println("Error al leer el fichero JSON: " + e.getMessage());
        }
	}
}
