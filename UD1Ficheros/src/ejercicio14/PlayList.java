package ejercicio14;

import java.util.List;

public interface PlayList {
	public void generar();
	public void guardar(String file) throws Exception;
	public List<Cancion> getLista();
}