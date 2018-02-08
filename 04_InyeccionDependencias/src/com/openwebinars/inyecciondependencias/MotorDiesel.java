package com.openwebinars.inyecciondependencias;

public class MotorDiesel implements IMotor{

	private int currentRPM;
	
	@Override
	public void acelerar() {
		/*
		realizarAdmision();
        realizarCompresion();
        realizarCombustion();        //Propio de los motores diesel
        realizarEscape();		 
        */
	}

	@Override
	public int getRevoluciones() {
		return currentRPM;
	}

}
