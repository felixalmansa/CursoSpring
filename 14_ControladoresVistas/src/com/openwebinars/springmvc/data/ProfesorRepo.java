package com.openwebinars.springmvc.data;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.openwebinars.springmvc.model.Profesor;

@Repository
public class ProfesorRepo {
		
	private Map<Integer, Profesor> profes;
	
	public ProfesorRepo() {
		profes = new HashMap<Integer, Profesor>();
		
		profes.put(1, new Profesor(1, "Carlos", "Sistemas", "carlos@openwbn.net"));
		profes.put(2, new Profesor(2, "Alberto", "Linux", "alberto@openwbn.net"));
		profes.put(3, new Profesor(3, "Luis Miguel", "Java", "luismi@openwbn.net"));
		profes.put(4, new Profesor(4, "Simón", ".Net", "simon@openwbn.net"));
		
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
