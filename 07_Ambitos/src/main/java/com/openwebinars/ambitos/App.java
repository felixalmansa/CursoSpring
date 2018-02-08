package com.openwebinars.ambitos;

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
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/openwebinars/xml/beans.xml");
        Mundo m1 = (Mundo) appContext.getBean("mundo");
        Mundo m2 = (Mundo) appContext.getBean("mundo");
        
        System.out.println(m1);
        System.out.println(m2);
        
        m2.setSaludo("marte");
        m2.setRadio(3397);

        System.out.println(m1);
        System.out.println(m2);

        
        ((ConfigurableApplicationContext) appContext).close();
    }
}
