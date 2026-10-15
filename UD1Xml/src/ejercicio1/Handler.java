package ejercicio1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ejercicio1.Libro;

public class Handler extends DefaultHandler {
	private List<Libro> libros = new ArrayList<>();
	private Libro libro;
	private int numLibros = 0;
	private Map<String, Double> map = new HashMap<>();
	private double precioMedio;
	private String tituloMasCaro;
	private double precioMasCaro;
	private String texto;
	
	public Handler() {
	}
	
	@Override
	public void endDocument() throws SAXException {
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("libro")) {
			libros.add(libro);
		} else if (qName.equals("titulo")) {
		} else if (qName.equals("autor"))  {
		} else if (qName.equals("anio"))   {
		} else if (qName.equals("precio")) {
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto = new String(ch, start, length);
	}
	
	@Override
	public void startDocument() throws SAXException {
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("libro"))
			libro = new Libro();
	}
	
}