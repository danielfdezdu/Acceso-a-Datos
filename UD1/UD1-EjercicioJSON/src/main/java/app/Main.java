package app;

import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import pojos.Employee;

public class Main {

	public static void main(String[] args) {
		
		// ---------------------------------- a) ----------------------------------
		
		ObjectMapper objectMapper = new ObjectMapper();
//		
//		Employee e = objectMapper.readValue(new File("files/employee.json"), Employee.class);
//		
//		System.out.println(e);
		
		
		// ---------------------------------- b) ----------------------------------
		
		try {
			byte[] jsonData = Files.readAllBytes(Paths.get("files/employee.json"));
			
			Employee e = objectMapper.readValue(jsonData, Employee.class);
			System.out.println(e);
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		// ---------------------------------- c) ----------------------------------
		
		
		
	}

}
