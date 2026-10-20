package ejercicio4;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;
import ejercicio4.Handler;

public class Ejercicio4 {

	public static void main(String[] args) {
		SAXParserFactory factory = SAXParserFactory.newInstance();
		Handler handler = new Handler();
			
		try {
			SAXParser parser = factory.newSAXParser();
			parser.parse("target/microsiervos.xml", handler);	
			
			Map<String, List<Noticia>> map = handler.getNoticias();
			for (String categoria: map.keySet()) {
				System.out.println(categoria);
				
				for (Noticia n: map.get(categoria))
					System.out.println("\t" + n);
			}
				
		} catch (ParserConfigurationException | SAXException e) {
			System.out.println(e.getMessage());
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
				
	}
}
