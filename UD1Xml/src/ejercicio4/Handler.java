package ejercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import ejercicio4.Noticia;

public class Handler extends DefaultHandler{
	private List<Noticia> map = new ArrayList<>();
	private Noticia noticia;
	private int numNoticias = 0;
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
	
	public List<Noticia> getNoticias() {
		return map.isEmpty()? null : noticias;
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException {
	}
	
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (inItem) {
			map.add(noticia);
		} else if (qName.equals("titulo")) {
			noticia.setTitulo(texto);
		} else if (qName.equals("autor"))  {
			noticia.setAutor(texto);
		} else if (qName.equals("categoria"))   {
			noticia.setCategoria(texto);
		} else if (qName.equals("fecha")) {
			DateTimeFormatter formato = DateTimeFormatter.RFC_1123_DATE_TIME;
			noticia.setFecha(LocalDateTime.parse(texto, formato));
		} else if (qName.equals("item")) {
			if (map.containsKey(noticia.getCategoria()))
				map.get(noticia.getCategoria()).add(noticia);
			else {
				map.put(noticia.getCategoria(), new ArrayList<Noticia>());
			}
			map.get(noticia.getCategoria()).add(noticia);
		}
	}
	
	@Override
	public void endDocument() throws SAXException {
	}
	
}
