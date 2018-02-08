package com.openwebinars.springrest.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Empleado {
	
	private long id;
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private List<Cita> citas;
	
	
	public Empleado() {}


	public Empleado(long id, String nombre, String apellidos, Date fechaNacimiento) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.citas = new ArrayList<Cita>();
	}


	public List<Cita> getCitas() {
		return citas;
	}


	public void setCitas(List<Cita> citas) {
		this.citas = citas;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	

}
