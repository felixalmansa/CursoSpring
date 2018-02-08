package com.openwebinars.beans.props;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App_Props {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_props.xml");
		
		
		ConexionBaseDatos c1, c2;
		
		c1 = (ConexionBaseDatos) appContext.getBean("Oracle");
		c2 = (ConexionBaseDatos) appContext.getBean("Mysql");
				
		System.out.println(c1);
		System.out.println(c2);
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
