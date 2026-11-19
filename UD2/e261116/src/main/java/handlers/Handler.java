package handlers;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler {

    private Map<Integer, Map<Integer, Double>> resultados;
    private Map<Integer, String> nombresPruebas;
    private int idPrueba;
    private int idAlumno;
    private double nota;

    private StringBuilder contenido;

    public Handler() {
        resultados = new HashMap<Integer, Map<Integer, Double>>();
        nombresPruebas = new HashMap<Integer, String>();
        contenido = new StringBuilder();
    }

    public Map<Integer, Map<Integer, Double>> leerResultados(
            String nombreFichero)
            throws ParserConfigurationException, SAXException, IOException {

        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        parser.parse(new File(nombreFichero), this);

        return resultados;
    }

    public Map<Integer, String> getNombresPruebas() {
        return nombresPruebas;
    }
    
    
}
