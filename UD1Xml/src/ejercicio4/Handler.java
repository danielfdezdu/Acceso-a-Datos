package ejercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ejercicio4.Noticia;

public class Handler extends DefaultHandler{
	private List<Noticia> map = new ArrayList<>();
	private Noticia noticia;
	private String texto;
	private boolean inItem = false;
		
	public Handler() {
	}
	
	@Override
	public void startDocument() throws SAXException {
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("item"))
			inItem = true;
		
			noticia = new Noticia(qName, qName, qName, null);
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {	
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (inItem) {
			map.add(noticia);
		} else if (qName.equals("titulo")) {
			noticia.setTitulo(texto);
		} else if (qName.equals("autor")) { 
			noticia.setAutor(texto);
		} else if (qName.equals("categoria")) {  
			noticia.setCategoria(texto);
		} else if (qName.equals("fecha")) {
			noticia.setFecha(texto);
		} else if (qName.equals("item")) {
			if (!map.contains(noticia.getCategoria())) {
					map.put(noticia.getCategoria(), new ArrayList<Noticia>());
				map.get(noticia.getCategoria()).add(noticia);
			}
		}
	}
	
	@Override
	public void endDocument() throws SAXException {
	}
	
	public Map<String, List<Noticia>> getNoticias() {
		return map.isEmpty()? null : noticias;
	}
	
	
}
