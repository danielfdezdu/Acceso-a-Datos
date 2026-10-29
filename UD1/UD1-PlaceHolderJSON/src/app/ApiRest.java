package app;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRest {
	public static void get() {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.GET()
				.build();
		
		try {
			HttpResponse<String> response =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		
			System.out.println("Código de estado: " +
					response.statusCode());
			System.out.println("Respuesta de JSON");
			System.out.println(response.body());
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void getParametrizado() {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts?userId=2"))
				.GET()
				.build();
		
		try {
			HttpResponse<String> response =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		
			System.out.println("Código de estado: " +
					response.statusCode());
			System.out.println("Respuesta de JSON");
			System.out.println(response.body());
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void post() {
		HttpClient client = HttpClient.newHttpClient();
		
		String json = """
			{
				"title": "2ºDAM",
				"body": "Cuerpo de prueba",
				"userId": 1
			}	
		""";
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts"))
				.header("Content-Type", "application/json")
				.POST(HttpRequest.BodyPublishers.ofString(json))
				.build();
		
		try {
			HttpResponse<String> response =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		
			System.out.println("Código de estado: " +
					response.statusCode());
			System.out.println("Respuesta de JSON");
			System.out.println(response.body());
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void delete() {
		HttpClient client = HttpClient.newHttpClient();
		
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://jsonplaceholder.typicode.com/posts/1"))
				.DELETE()
				.build();
		
		try {
			HttpResponse<String> response =
					client.send(request, HttpResponse.BodyHandlers.ofString());
		
			System.out.println("Código de estado: " +
					response.statusCode());
			System.out.println("Respuesta de JSON");
			System.out.println(response.body());
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
}
