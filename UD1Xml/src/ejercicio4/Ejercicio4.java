package ejercicio4;

import java.io.IOException;
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
				
		} catch (ParserConfigurationException | SAXException e) {
			System.out.println(e.getMessage());
				
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
				
	}
}
