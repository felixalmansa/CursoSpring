package com.openwebinars.inyecciondependencias;

public class Main {
	
	public static void main(String[] args) {
        /*Al proporcionar un objeto que implementa la interfaz IMotor 
        como parámetro del constructor de Vehiculo, estamos inyectando 
        la dependencia.*/
        VehiculoV3 cocheDiesel = new VehiculoV3(new MotorDiesel());
        
        
        /*En este caso, realizamos otra inyección de una dependencia, 
        pero con una instancia de MotorGasolina.*/
        VehiculoV3 cocheGasolina = new VehiculoV3(new MotorGasolina());

        //...

	}

}
