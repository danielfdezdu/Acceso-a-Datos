package ejercicio11;

import java.io.File;
import java.util.List;

public interface DataImporter {

	public List<Cliente> importData(File file);
	
}
