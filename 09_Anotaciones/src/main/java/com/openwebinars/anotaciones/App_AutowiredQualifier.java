package com.openwebinars.anotaciones;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.openwebinars.anotaciones.autowire.Cliente;



public class App_AutowiredQualifier {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");

		Cliente c = (Cliente) appContext.getBean("cliente");
		
		System.out.println(c);

		((ConfigurableApplicationContext) appContext).close();

	}

}
