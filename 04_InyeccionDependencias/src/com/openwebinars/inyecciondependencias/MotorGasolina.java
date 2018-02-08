package com.openwebinars.inyecciondependencias;

public class MotorGasolina implements IMotor{

	private int currentRPM;
	
	@Override
	public void acelerar() {
		/*
		realizarAdmision();
        realizarCompresion();
        realizarExplosion();        //Propio de los motores de gasolina
        realizarEscape();
		 */
	}

	@Override
	public int getRevoluciones() {
		return currentRPM;
	}

}
