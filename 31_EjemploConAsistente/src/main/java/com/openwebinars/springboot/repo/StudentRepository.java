package com.openwebinars.springboot.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openwebinars.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{
	
	

}
