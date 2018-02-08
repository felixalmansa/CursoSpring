package com.openwebinars.beans.map;

import java.util.Map;

public class Agenda {
	
	private Map<String, Contacto> contactos;
	
	public Agenda() { }

	public Agenda(Map<String, Contacto> contactos) {
		this.contactos = contactos;
	}

	public Map<String, Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(Map<String, Contacto> contactos) {
		this.contactos = contactos;
	}

	@Override
	public String toString() {
		StringBuffer str = new StringBuffer();
		for(String tel : contactos.keySet()) {
			Contacto c = contactos.get(tel);
			str.append(c.toString()+", ");
		}
		return "Agenda [contactos=" + str.toString() + "]";
	}
	
	
	

}
