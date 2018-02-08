package com.openwebinars.ciclodevida.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class ClientesServicio implements InitializingBean, DisposableBean {


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


    public void afterPropertiesSet() throws Exception {
        System.out.println("DESPUÉS DE INICIO");
    }

    public void destroy() throws Exception {
        System.out.println("ANTES DEL FIN");

    }
}
