package com.openwebinars.ciclodevida.beanpostprocessor;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ClientesServicio  {


    String mensaje;

    public ClientesServicio() { }

    public ClientesServicio(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @PostConstruct
    public void initBean() {
        System.out.println("DESPUÉS DE INICIO");
    }

    @PreDestroy
    public void destroyBean() {
        System.out.println("ANTES DEL FIN");

    }
}
