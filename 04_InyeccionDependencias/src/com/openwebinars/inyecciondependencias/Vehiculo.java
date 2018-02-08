package com.openwebinars.inyecciondependencias;

public class Vehiculo {
	
    private Motor m;

    public Vehiculo() {
        m = new Motor();
    }

    public int getRevolucionesMotor() {
        return m.getRevoluciones();
    }
    
}
