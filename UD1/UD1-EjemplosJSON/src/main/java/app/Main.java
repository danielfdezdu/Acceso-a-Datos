package app;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		ObjectMapper objectMapper = new ObjectMapper();
		
		Car car = objectMapper.readValue(new File("files/car.json"), Car.class);
		
		System.out.println(car);
	}
	
}
