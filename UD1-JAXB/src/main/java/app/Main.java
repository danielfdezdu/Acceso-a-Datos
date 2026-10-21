package app;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import pojos.TipoNegocio;
import pojos.TipoPersona;
import pojos.TipoRoot;
import pojos.TipoPersona;

public class Main {

	public static void main(String[] args) {
		try {
		Unmarshaller unmarshaller = 
			JAXBContext.newInstance("pojo").createUnmarshaller();
		
		JAXBElement<TipoRoot> rootElement =
				(JAXBElement<TipoRoot>) unmarshaller.unmarshal(new File("target/personas.xml"));
		
		TipoRoot root = rootElement.getValue();
		
		for (TipoPersona p: root.getListaPersona().getPersona()) {
			System.out.println(p);
		}
		
		for (TipoNegocio n: root.getListaNegocio().getNegocio()) {
			System.out.println(n);
		}

		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
	}

}
