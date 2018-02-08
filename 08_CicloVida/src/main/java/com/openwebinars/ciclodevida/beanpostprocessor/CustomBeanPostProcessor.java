package com.openwebinars.ciclodevida.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class CustomBeanPostProcessor implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Bean %s inicializado satisfactoriamente".toUpperCase(), beanName));
        return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println(String.format("Inicializando bean %s".toUpperCase(),beanName));
        return bean;
	}
	
	

}
