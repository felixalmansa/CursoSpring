package com.openwebinars.ciclodevida.beanpostprocessor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans_bpp.xml");
		
		ClientesServicio cs = (ClientesServicio) appContext.getBean("clienteservicio");
		Mundo m = (Mundo) appContext.getBean("mundo");
		
		System.out.println(cs.getMensaje());
		System.out.println(m);
		
		((ConfigurableApplicationContext) appContext).close();
    }
}
