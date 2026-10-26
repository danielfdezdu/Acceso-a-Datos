package app.Ejercicio5;

import java.io.File;
import java.util.List;
import java.util.Map;

import pojos.Ejercicio5.Plataforma;
import pojos.Ejercicio5.Serie;

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
	
	private static void marshal() {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance("pojos");
			Marshaller marshaller = jaxbContext.createMarshaller();
			
			marshaller.setProperty("jaxb.formatted.output", true);
			marshaller.marshal(plataforma, new File("nuevo xml"));
			
		} catch (JAXBException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		Plataforma plataforma = unmarshal();
		
		Map<String, List<Serie>> mapa =
				plataforma.getContenidos().getSeries().getByGenero();
			
			for (String genero: mapa.keySet()) {
				System.out.println(genero);
				List<Serie> lista = mapa.get(genero);
				lista.forEach(s -> System.out.println("\t" + s));
			}
			
				Serie s = new Serie();
				s.setTitulo("Slow Horses");
				s.getGenero("Thriller");
				plataforma.getContenidos().getSeries().getSerie().add(s);
				
				s = new Serie();
				s.setTitulo("Los Soprano");
				s.getGenero("Drama");
				plataforma.getContenidos().getSeries().getSerie().add(s);
				
				marshal(plataforma);
	}
	
}

