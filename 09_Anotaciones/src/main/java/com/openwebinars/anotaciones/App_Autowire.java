package com.openwebinars.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.openwebinars.anotaciones.autowire.Poblacion;



public class App_Autowire {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");

		Poblacion pobl1 = (Poblacion) appContext.getBean("MairenaAljarafe");
		Poblacion pobl2 = (Poblacion) appContext.getBean("SevillaCapital");
		
		System.out.println(pobl1);
		System.out.println(pobl2);

		((ConfigurableApplicationContext) appContext).close();

	}

}
