package com.openwebinars.springmvc.model;

public class Profesor {

	private int id;
	private String nombre;
	private String seminario;
	private String email;

	
	public Profesor() {	}
	

	public Profesor(int id, String nombre, String seminario, String email) {
		this.id = id;
		this.nombre = nombre;
		this.seminario = seminario;
		this.email = email;
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

}
