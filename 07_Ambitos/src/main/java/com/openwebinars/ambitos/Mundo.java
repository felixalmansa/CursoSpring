package com.openwebinars.ambitos;

public class Mundo {
	
    private String saludo;
    private int radio;

    public Mundo(String saludo) {
        this.saludo = saludo;
    }

    public Mundo(int radio) {
        this.radio = radio;
    }

    public Mundo(String saludo, int radio) {
        this.saludo = saludo;
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }

	@Override
	public String toString() {
		return saludo + "(" + Integer.toString(radio) + " km.)";
	}
    
    

}
