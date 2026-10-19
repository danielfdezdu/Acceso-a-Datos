package ejercicio4;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ejercicio1.Libro;

public class Handler extends DefaultHandler{
	private List<Noticia> noticias = new ArrayList<>();
	private Noticia noticia;
	private int numNoticias = 0;
	private String texto;
		
	public Handler() {
	}
	
	@Override
	public void startDocument() throws SAXException {
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("noticia"))
			noticia = new Noticia();
			noticia.setTitulo(attributes.getValue("Titulo"));
			noticia.setAutor(attributes.getValue("Autor"));
			noticia.setCategoria(attributes.getValue("Categoria"));
			noticia.setFecha(attributes.getValue("Fecha"));

	}
	
	public List<Noticia> getNoticias() {
		return noticias.isEmpty()? null : noticias;
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("noticia")) {
			noticias.add(noticia);
		} else if (qName.equals("titulo")) {
			noticias.setTitulo(texto);
		} else if (qName.equals("autor"))  {
			noticias.setAutor(texto);
		} else if (qName.equals("categoria"))   {
			noticias.setAnio(texto);
		} else if (qName.equals("fecha")) {
			noticia.setPrecio(texto);			
		}
	}
	
	@Override
	public void endDocument() throws SAXException {
	}
	
}
