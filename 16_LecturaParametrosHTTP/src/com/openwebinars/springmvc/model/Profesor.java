package com.openwebinars.springmvc.model;

import java.util.List;

public class Profesor {

	private int id;
	private String nombre;
	private String seminario;
	private String email;
	private List<Asignatura> listadoAsignaturas;

	
	public Profesor() {	}
	

	public Profesor(int id, String nombre, String seminario, String email) {
		this.id = id;
		this.nombre = nombre;
		this.seminario = seminario;
		this.email = email;
	}


	public Profesor(int id, String nombre, String seminario, String email, List<Asignatura> listadoAsignaturas) {
		this.id = id;
		this.nombre = nombre;
		this.seminario = seminario;
		this.email = email;
		this.listadoAsignaturas = listadoAsignaturas;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSeminario() {
		return seminario;
	}

	public void setSeminario(String seminario) {
		this.seminario = seminario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	public List<Asignatura> getListadoAsignaturas() {
		return listadoAsignaturas;
	}


	public void setListadoAsignaturas(List<Asignatura> listadoAsignaturas) {
		this.listadoAsignaturas = listadoAsignaturas;
	}
	
	

}
