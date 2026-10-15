package app;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class Main {

	public static void main(String[] args) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		Handler handler = new Handler();
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse("target/priceList.xml", handler);
			
			handler.getCafes().forEach(System.out::println);
			
		} catch (ParserConfigurationException | SAXException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
