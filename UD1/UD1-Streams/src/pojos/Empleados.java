package pojos;

import java.util.ArrayList;

// public class Empleados {

//		Puede contener varios empleados.
//		Devolver empleados cuyo salario, como mucho, alcance un tope especificado por el usuario.
	
//	private ArrayList<Empleado> lista = new ArrayList();
//
//	public void addEmpleado (Empleado empleado) throws Exception {
//		if(lista.contains(empleado))
//			throw new Exception ("Ya está en la lista");
//		else lista.add(empleado);	
//	}
//
//	public void setLista(ArrayList<Empleado> lista) {
//		this.lista = lista;
//	}
	
	public class Empleados extends ArrayList<Empleado> {
		public ArrayList<Empleado> filtrar(int salarioTope) {
			ArrayList<Empleado> res = new ArrayList();
			
			for (Empleado e : this) 
				if (e.getSalario() <= salarioTope) 
					res.add(e);
				
					return res.isEmpty()? null : res;
		}
	}
				
//		Crear estructura de datos para que contenga los datos.		
//		Recorrer mi colección de empleados y aquellos que cumplan la condición, añadirlos a la colección.
		

