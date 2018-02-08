package com.openwebinars.ciclodevida.xml;

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


    public void initBean() {
        System.out.println("DESPUÉS DE INICIO");
    }

    public void destroyBean() {
        System.out.println("ANTES DEL FIN");

    }
}
