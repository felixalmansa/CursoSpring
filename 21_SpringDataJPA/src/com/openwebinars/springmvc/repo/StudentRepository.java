package com.openwebinars.springmvc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.openwebinars.springmvc.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
