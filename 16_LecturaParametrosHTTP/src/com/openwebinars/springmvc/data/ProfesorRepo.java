package com.openwebinars.springmvc.data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.openwebinars.springmvc.model.Asignatura;
import com.openwebinars.springmvc.model.Profesor;

@Repository
public class ProfesorRepo {
		
	private Map<Integer, Profesor> profes;
	
	public ProfesorRepo() {
		profes = new HashMap<Integer, Profesor>();
		
		profes.put(1, new Profesor(1, "Carlos", "Sistemas", "carlos@openwbn.net"));
		List<Asignatura> listado1 = new ArrayList<Asignatura>();
		listado1.add(new Asignatura(1, "Despliegue de aplicaciones web", 60));
		listado1.add(new Asignatura(2, "Instalación de servicios de red WiFi", 50));		
		profes.get(1).setListadoAsignaturas(listado1);

		profes.put(2, new Profesor(2, "Alberto", "Linux", "alberto@openwbn.net"));
		List<Asignatura> listado2 = new ArrayList<Asignatura>();
		listado2.add(new Asignatura(3, "Instalación de servidores Ubuntu", 100));
		listado2.add(new Asignatura(4, "Firewalls con iptables", 50));		
		profes.get(2).setListadoAsignaturas(listado2);

		profes.put(3, new Profesor(3, "Luis Miguel", "Java", "luismi@openwbn.net"));
		List<Asignatura> listado3 = new ArrayList<Asignatura>();
		listado3.add(new Asignatura(5, "Desarrollo de aplicaciones Java seguras", 25));
		listado3.add(new Asignatura(6, "Implementación de aplicaciones web con Java", 50));		
		profes.get(3).setListadoAsignaturas(listado3);


		profes.put(4, new Profesor(4, "Simón", ".Net", "simon@openwbn.net"));
		List<Asignatura> listado4 = new ArrayList<Asignatura>();
		listado4.add(new Asignatura(7, "Desarrollo sobre Windows Azure", 100));
		listado4.add(new Asignatura(8, "Microservicios web con .Net", 50));		
		profes.get(4).setListadoAsignaturas(listado4);

	}
	
	public Profesor findProfesor(int id) {
		if (profes.containsKey(id)) 
			return profes.get(id);
		return null;
	}
	
	public List<Profesor> findAllProfesor() {
		return new LinkedList<Profesor>(profes.values());
	}
	

}
