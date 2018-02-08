package com.openwebinars.beans.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App_List {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_list.xml");
		
		Provincia p = (Provincia) appContext.getBean("Sevilla");
				
		System.out.println(p.toString());
				
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
