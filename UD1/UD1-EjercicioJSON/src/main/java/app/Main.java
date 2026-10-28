package app;

import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import pojos.Employee;
import pojos.Employees;

public class Main {

	public static void main(String[] args) {

		// ----------------------------------- a) -----------------------------------

//		ObjectMapper objectMapper = new ObjectMapper();
//
//		Employee e = objectMapper.readValue(new File("files/employee.json"), Employee.class);
//
//		System.out.println(e);


		// ---------------------------------- a.2) ----------------------------------

//		try {
//			byte[] jsonData = Files.readAllBytes(Paths.get("files/employee.json"));
//
//			Employee e = objectMapper.readValue(jsonData, Employee.class);
//			System.out.println(e);
//
//		} catch (IOException e) {
//			System.out.println(e.getMessage());
//		}

		// ----------------------------------- b) -----------------------------------

//		ObjectMapper objectMapper = JsonMapper.builder()
//				.enable(SerializationFeature.INDENT_OUTPUT)
//				.build();
//		Employee Employee = new Employee();
//		objectMapper.writeValue(new File("files/employee.json"), Employee.createEmployee());

		// ---------------------------------- c.d) ----------------------------------

		ObjectMapper objectMapper = new ObjectMapper();

//		Employee[] employees = objectMapper.readValue(new File("files/employee.json"), Employee[].class);
//		for(Employee e: employees)
//
//		System.out.println(e);
//
//		List<Employee> employeeList = objectMapper.readValue(new File("files/employee.json"), new TypeReference<List<Employee>>() {});

		Employees employees =
				objectMapper.readValue(new File("files/employees.json"), Employees.class);
		employees.forEach(System.out::println);

	}

}
