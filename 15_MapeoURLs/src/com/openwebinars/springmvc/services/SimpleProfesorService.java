package com.openwebinars.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.openwebinars.springmvc.data.ProfesorRepo;
import com.openwebinars.springmvc.model.Profesor;

@Service
public class SimpleProfesorService implements ProfesorService {

	
	@Autowired
	private ProfesorRepo profesorRepository;
	
	@Override
	public List<Profesor> getProfesores() {
		return profesorRepository.findAllProfesor();		
	}

	@Override
	public Profesor getById(int id) {
		return profesorRepository.findProfesor(id);
	}

}
