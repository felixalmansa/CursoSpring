package com.openwebinars.anotaciones.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mundo {
	
	@Value("Hola Mundo!")
	private String saludo;
	
	public Mundo() { } 

	public Mundo(String saludo) {
		this.saludo = saludo;
	}

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

	@Override
	public String toString() {
		return "Mundo [saludo=" + saludo + "]";
	}
	

}
