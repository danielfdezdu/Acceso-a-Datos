package app.Ejercicio5;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pojos.Ejercicio5.Plataforma;
import pojos.Ejercicio5.TipoNegocio;
import pojos.Ejercicio5.TipoPersona;
import pojos.Ejercicio5.TipoRoot;

public class Main {
	
	private static Plataforma unmarshal() {
		Plataforma plataforma = null;
		
		try {
			Unmarshaller unmarshaller = 
					JAXBContext.newInstance("pojos").createUnmarshaller();
				
			plataforma = (Plataforma) unmarshaller.unmarshal(new File("target/streaming.xml"));
		
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
		
		return plataforma;
	}

	public static void main(String[] args) {
		Plataforma plataforma = unmarshal();
	}

	

}
