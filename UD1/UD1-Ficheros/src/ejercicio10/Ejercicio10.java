package ejercicio10;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.stream.Stream;

public class Ejercicio10 {
	
	public static void main(String[] args) throws NoSuchAlgorithmException, IOException, InterruptedException {
	String contraseña = "2345hg3";
	String sha1;
		
	MessageDigest digest = MessageDigest.getInstance("SHA-1"); 
	digest.reset();
	digest.update(contraseña.getBytes("utf8")); 
	sha1 = String.format("%040x", new BigInteger(1, digest.digest())).toUpperCase(); 
	// %040x: El cero anterior a 40x rellenar con ceros no significativos
	
	String url = ("https://api.pwnedpasswords.com/range/" + sha1.substring(0 , 5)); 
	
	HttpClient client = HttpClient.newHttpClient();  
	HttpRequest request = HttpRequest.newBuilder() 
	.uri(URI.create(url)) 
	.build(); 
	HttpResponse<Stream<String>> response =  
	client.send(request, HttpResponse.BodyHandlers.ofLines()); 
	List<String> lista = response.body().toList(); 
	
	for (String string : lista) {
		System.out.println(string);
	}
	
	}
}
