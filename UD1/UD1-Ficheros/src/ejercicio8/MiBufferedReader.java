package ejercicio8;

import java.io.*;

public class MiBufferedReader implements AutoCloseable{
	
	private Reader reader;
	
	public MiBufferedReader(Reader reader) {
		this.reader = reader;
	}

	@Override
	public void close() throws Exception {
		reader.close();
	}
	
	public String readLine() throws IOException {
		StringBuilder sb = new StringBuilder();
		int caracter;
		
		while ((caracter = reader.read()) != -1 && caracter != '\n') {
			
			// En Windows el final de línea está marcado como \r\n
			// o códigos 13 10
			if (caracter == '\r')
			sb.append((char)caracter);
		}	
		
		if (caracter == -1 && sb.length() == 0)
			return null;
			
		return sb.toString();
	}
}
