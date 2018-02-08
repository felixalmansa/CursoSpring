package com.openwebinars.springmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openwebinars.springmvc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	/* Realizar la búsqueda en base al nombre */
	public List<Student> findByFirstName(String firstName);
	
	/* Realizar la búsqueda en base al apellido */
	public List<Student> findByLastName(String lastName);
	
	/* Realizar la búsqueda en base al nombre y el apellido */
	public List<Student> findByFirstNameAndLastName(String firstName, String lastName);
	
	/* Realizar la búsqueda en base al nombre y el apellido, y ordenar los resultados descendentemente por apellido  */
	public List<Student> findByFirstNameAndLastNameOrderByFirstNameDesc(String firstName, String lastName);
	
}
