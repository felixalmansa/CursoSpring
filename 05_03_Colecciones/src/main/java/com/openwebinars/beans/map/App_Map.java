package com.openwebinars.beans.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App_Map {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_map.xml");
		
		Agenda agenda = (Agenda) appContext.getBean("agenda");
		
		System.out.println(agenda.toString());
		
		((ConfigurableApplicationContext) appContext).close();

	}

}
