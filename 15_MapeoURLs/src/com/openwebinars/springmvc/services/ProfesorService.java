package com.openwebinars.springmvc.services;

import java.util.List;

import com.openwebinars.springmvc.model.Profesor;


public interface ProfesorService {
	
	public List<Profesor> getProfesores();
	
	public Profesor getById(int id);
	
	

}
