package com.openwebinars.springrest.model;

import java.util.Date;

public class Cita {
	
	private Long id;
	private String texto;
	private Date fecha;
	
	public Cita() { }

	public Cita(Long id, String texto, Date fecha) {
		this.id = id;
		this.texto = texto;
		this.fecha = fecha;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
}
