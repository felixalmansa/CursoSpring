package com.openwebinars.beans.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App_Set {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_set.xml");
		
		
		Alumno a = (Alumno) appContext.getBean("Luismi");
				
		System.out.println(a);
				
		((ConfigurableApplicationContext) appContext).close();

	}

}
