package com.openwebinars.beans.list;

import java.util.List;

public class Provincia {
	
	private String nombre;
	private List<Poblacion> poblaciones;
	
	public Provincia() { }

	public Provincia(String nombre, List<Poblacion> poblaciones) {
		this.nombre = nombre;
		this.poblaciones = poblaciones;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Poblacion> getPoblaciones() {
		return poblaciones;
	}

	public void setPoblaciones(List<Poblacion> poblaciones) {
		this.poblaciones = poblaciones;
	}

	@Override
	public String toString() {
		
		//StringBuffer es un método mucho más conveniente para trabajar con cadenas dinámicas
		StringBuffer sb = new StringBuffer();
		//Concatenamos el inicio de la cadena
		sb.append("Provincia [nombre=" + nombre + ", poblaciones=[" );
		/*Para todas las provincias, a excepción de la última, 
		añadimos su reperesentación como cadena de caracteres, y una coma*/		
		for (int i = 0; i <= poblaciones.size()-2; i++) {
			if (poblaciones.get(i) != null)
				sb.append(poblaciones.get(i).toString()+",");
			else
				sb.append("null, ");
		} 
		/* Añadimos la reperesentación como cadena de caracteres de la última provincia, 
		 * y corchete de cierre */
		if (poblaciones.get(poblaciones.size()-1) != null)
			sb.append(poblaciones.get(poblaciones.size()-1).toString()+ "]");
		else
			sb.append("null ]");
		//Devolvemos el StringBuffer como una cadena de caracteres de tipo String
		return sb.toString();
	}
	
	
	
	
	
	

}
