package com.openwebinars.beans.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Alumno {
	
	private String nombre;
	private Set<Nota> notas;
	
	public Alumno() { }

	public Alumno(String nombre, Set<Nota> notas) {
		this.nombre = nombre;
		this.notas = notas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Set<Nota> getNotas() {
		return notas;
	}

	public void setNotas(Set<Nota> notas) {
		this.notas = notas;
	}

	@Override
	public String toString() {
		//return "Alumno [nombre=" + nombre + ", notas=" + notas + "]";
		//StringBuffer es un método mucho más conveniente para trabajar con cadenas dinámicas
		StringBuffer sb = new StringBuffer();
		//Concatenamos el inicio de la cadena
		sb.append("Alumno [nombre=" + nombre + ", notas=[" );
		/*Para todas las notas, a excepción de la última, 
		añadimos su reperesentación como cadena de caracteres, y una coma.
		Transformamos el Set en un List para recorrerlo más cómodamente. */		
		List<Nota> listaAuxiliar = new LinkedList<Nota>();
		listaAuxiliar.addAll(notas);
		for (int i = 0; i <= listaAuxiliar.size()-2; i++) {
			if (listaAuxiliar.get(i) != null)
				sb.append(listaAuxiliar.get(i).toString()+",");
			else
				sb.append("null, ");
		} 
		/* Añadimos la reperesentación como cadena de caracteres de la última nota, 
		 * y corchete de cierre */
		if (listaAuxiliar.get(listaAuxiliar.size()-1) != null)
			sb.append(listaAuxiliar.get(listaAuxiliar.size()-1).toString()+ "]");
		else
			sb.append("null ]");
		//Devolvemos el StringBuffer como una cadena de caracteres de tipo String
		return sb.toString();
	}
	
	
	

}
