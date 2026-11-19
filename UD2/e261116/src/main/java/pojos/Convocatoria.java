package pojos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import handlers.CalificacionesHandler;
import handlers.Handler;
import tools.jackson.databind.ObjectMapper;

public class Convocatoria {

	private String nombre;
    private ArrayList<Aspirante> aspirantes;
    private Map<Integer, Map<Integer, Double>> resultados;
    private Profesores profesores;
    
    public Convocatoria(String nombre) {
    	this.nombre = nombre;
        aspirantes = new ArrayList<Aspirante>();
    }

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Aspirante> getAspirantes() {
        return aspirantes;
    }
	
	public Map<Integer, Map<Integer, Double>> getResultados() {
	    return resultados;
	}
	
	public Profesores getProfesores() {
	    return profesores;
	}
	
	// Ejercicio 1. Lectura de aspirantes y registro en una lista.
	public void leerAspirantes(String nombreFichero) throws IOException {

		try (InputStreamReader isr = new InputStreamReader(new FileInputStream("datos/aspirantes.txt"), 
		StandardCharsets.UTF_8);
		BufferedReader br = new BufferedReader(isr) ) {
			String linea;
			while((linea = br.readLine()) != null)
			System.out.println(linea);
		} catch (FileNotFoundException ex) {
			System.out.println("No se encontró el fichero.");
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

    }
	
	// Ejercicio 2. Lectura de resultados desde el fichero XML
	public void leerResultados(String nombreFichero)
	        throws ParserConfigurationException, SAXException, IOException {
		
		SAXParserFactory factory = SAXParserFactory.newInstance();
	    SAXParser parser;
		try {
			parser = factory.newSAXParser();
			CalificacionesHandler handler = new CalificacionesHandler();
			parser.parse("calificaciones.xml", handler);
		} catch (ParserConfigurationException | SAXException | IOException ex) {
			System.out.println(ex.getMessage());
		}
		
	}

	// Ejercicio 3. Cálculo de nota media por aspirante y ordenación de resultados.
	public void ordenarAspirantesPorNotaMedia() {
		
		
	    
		
		
		
	}
	
	// Ejercicio 4. Exportación de resultados a un fichero de texto.
	public void guardarClasificacion(String nombreFichero) throws IOException {
		
		
		
		
		
		
	}
	
	// Ejercicio 5. Lectura de fichero de profesores desde un JSON.
	public void leerProfesores(String nombreFichero) throws IOException {
	    
		ObjectMapper objectMapper= new ObjectMapper();
		Profesores profesor = objectMapper.readValue(new File("datos/profesores.json"), Profesores.class);
		System.out.println(profesor);
		
	}
}