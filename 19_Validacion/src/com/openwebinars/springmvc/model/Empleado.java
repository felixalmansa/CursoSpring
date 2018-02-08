package com.openwebinars.springmvc.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Empleado {
	
	
	@NotEmpty
	@Size(min = 3, max = 30)
	private String nombre;
    
	
	@NotNull
	private long id;
	
	@NotEmpty
	@Email
    private String email;
    
    public Empleado() {
    	
    }
    
	public Empleado(String nombre, long id, String email) {
		this.nombre = nombre;
		this.id = id;
		this.email = email;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
