package com.openwebinars.beans;

public class Culata {
	
	private int cantidadBujias;

	public Culata() {}
	
	public Culata(int cantidadBujias) {		
		this.cantidadBujias = cantidadBujias;
	}

	public int getCantidadBujias() {
		return cantidadBujias;
	}

	public void setCantidadBujias(int cantidadBujias) {
		this.cantidadBujias = cantidadBujias;
	}

	@Override
	public String toString() {
		return "Culata [cantidadBujias=" + cantidadBujias + "]";
	}
		
}
