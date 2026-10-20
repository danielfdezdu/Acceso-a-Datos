package ejercicio4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler{
	private Noticia noticia;
	private Map<String, List<Noticia>> map = new HashMap<>();
	private boolean inItem = false;
	private String texto;
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("item")) {
			inItem = true;
			
			noticia = new Noticia();
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (inItem) {
			if (qName.equals("title"))
				noticia.setTitulo(texto);
			else if (qName.equals("author"))
				noticia.setAutor(texto);
			else if (qName.equals("link"))
				noticia.setLink(texto);
			else if (qName.equals("category"))
				noticia.setCategoria(texto);
			else if (qName.equals("pubDate")) {
				DateTimeFormatter formato = DateTimeFormatter.RFC_1123_DATE_TIME;
				noticia.setFechaPublicacion(LocalDateTime.parse(texto, formato));
			} else if (qName.equals("item")) {
				if (!map.containsKey(noticia.getCategoria()))
					map.put(noticia.getCategoria(), new ArrayList<Noticia>());
				map.get(noticia.getCategoria()).add(noticia);
			}
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto = new String(ch, start, length);
	}

	public Map<String, List<Noticia>> getNoticias(){
		return map.isEmpty()? null : map;
	}
}
