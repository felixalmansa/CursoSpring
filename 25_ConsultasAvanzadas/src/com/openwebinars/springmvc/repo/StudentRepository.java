package com.openwebinars.springmvc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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
	public List<Student> findByFirstNameAndLastNameOrderByLastNameDesc(String firstName, String lastName);
	
	/*
	 * CONSULTAS AVANZADAS
	 */
	
	/* Realizar la búsqueda en base al id */
	public Student findById(Long id);
	
	/* Realizar la búsqueda en base al id */
    @Query("select s from Student s where s.id = ?1")
    public Student findByIdVersion2(Long id);
    
    /* Realizar la búsqueda si el apellido comienza con una cadena */
    @Query("select s from Student s where s.lastName like ?1%")
    public List<Student> findByLastNameStartsWith(String lastName);
    
    
    /* Realizar la búsqueda si coincide el nombre y el apellido */
    @Query("select s from Student s where s.firstName = :firstname or s.lastName = :lastname")
    public List<Student> findByFirstNameOrLastName(@Param("firstname") String firstName, @Param("lastname") String lastName);
    
    /* Actualizar el nombre y el apellido */
    @Modifying
    @Query("update Student s set s.firstName = ?1, s.lastName = ?2 where s.id = ?3")
    int setFirstNameAndLastNameFor(String firstname, String lastname, Long id);
    
	
}
