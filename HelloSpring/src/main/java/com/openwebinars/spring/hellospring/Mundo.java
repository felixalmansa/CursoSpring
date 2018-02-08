package com.openwebinars.spring.hellospring;

public class Mundo {
	
	
	private String mensaje;
	
	public Mundo() { }
	
	public Mundo(String mensaje) {
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
