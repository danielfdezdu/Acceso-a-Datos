package apiRest;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import pojos.RespuestaTMDB;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.SerializationFeature;
import tools.jackson.databind.json.JsonMapper;

public class ClienteTMDB {
	public void buscarPeliculas(String titulo) {
		HttpClient client = HttpClient.newHttpClient();
		String apiKey = "ba9a7c4b35cfc2672540c7c6d369acdd";
		
		ObjectMapper objectMapper = JsonMapper.builder()
			.enable(SerializationFeature.INDENT_OUTPUT)
			.build();
		
		// Este objeto es un reflejo de la información que recibo en el JSON
		RespuestaTMDB resultado = null;
		
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://api.themoviedb.org/3/search/movie?query="
		            + titulo + "&api_key="
					+ apiKey + "&language=es-ES"))
			.GET()
			.build();
		
		try {
			HttpResponse<String> response =
				client.send(request, HttpResponse.BodyHandlers.ofString());
			
			resultado = objectMapper.readValue(response.body(), RespuestaTMDB.class);
			
		} catch (IOException | InterruptedException e) {
			System.out.println(e.getMessage());
		}
		
		return resultado.getResults();
		
	}
}

