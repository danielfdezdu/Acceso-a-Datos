package app;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Handler extends DefaultHandler {
	
	private List<Cafe> cafes = new ArrayList<>();
	private Cafe cafe;
	private String texto;

//	@Override
//	public void startDocument() throws SAXException {
//		System.out.println("inicio documento");
//	}
//
//	@Override
//	public void endDocument() throws SAXException {
//		System.out.println("fin documento");
//	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("coffee"))
			cafe = new Cafe();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("coffee"))
			cafes.add(cafe);
		else if (qName.equals("name"))
			cafe.setNombre(texto);
			else if (qName.equals("price"))
		cafe.setPrecio(Double.parseDouble(texto));
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		texto = new String(ch, start, length);
	}
	
	public List<Cafe> getCafes() {
		return cafes.isEmpty()? null : cafes;
	}

}
