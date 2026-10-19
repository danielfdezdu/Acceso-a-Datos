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
	private String tituloMasCaro;
	private double precioMasCaro = 0.0;
	private double sumaPrecios = 0.0;
	private String texto;
	private String categoria;
	
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
			libro.setTitulo(texto);
		} else if (qName.equals("autor"))  {
			libro.setAutor(texto);
		} else if (qName.equals("anio"))   {
			libro.setAnio(Integer.parseInt(texto));
		} else if (qName.equals("precio")) {
			double precio = Double.parseDouble(texto);
			libro.setPrecio(precio);
			sumaPrecios += precio;
			
			if (precio > precioMasCaro) {
				precioMasCaro = precio;
				tituloMasCaro = libro.getTitulo();
			}
			
		}
	}
	
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto = new String(ch, start, length);
	}
	
	public List<Libro> getLibros() {
		return libros.isEmpty()? null : libros;
	}
	
	public int getNumLibros() {
		return numLibros;
	}
	
	public double getPrecioMedio() {
		return sumaPrecios / numLibros;
	}
	
	public String getTituloMasCaro() {
		return tituloMasCaro;
	}
	
	public double getPrecioMasCaro() {
		return precioMasCaro;
	}
	
	public String getCategoria() {
		return categoria;
	}

	public Map<String, Double> getContadorPorCategoria() {
		return map;
	}
	
	@Override
	public void startDocument() throws SAXException {
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("libro"))
			libro = new Libro();
			libro.setId(attributes.getValue("id"));
			libro.setCategoria(attributes.getValue("categoria"));
			numLibros++;
			
			if (map.containsKey(libro.getCategoria()))
					map.put(libro.getCategoria(), map.get(libro.getCategoria()) + 1);
			else
				map.put(libro.getCategoria(), (double) 1);
	}
	
}