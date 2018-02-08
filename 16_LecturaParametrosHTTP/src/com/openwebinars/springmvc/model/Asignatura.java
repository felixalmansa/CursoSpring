package com.openwebinars.springmvc.model;

public class Asignatura {
	
	private int id;
	private String titulo;
	private int numHoras;
	
	public Asignatura() {
		
	}

	public Asignatura(int id, String titulo, int numHoras) {
		this.id = id;
		this.titulo = titulo;
		this.numHoras = numHoras;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumHoras() {
		return numHoras;
	}

	public void setNumHoras(int numHoras) {
		this.numHoras = numHoras;
	}

	@Override
	public String toString() {
		return "Asignatura [id=" + id + ", titulo=" + titulo + ", numHoras=" + numHoras + "]";
	}
	
	
	
	
	
	
	

}
