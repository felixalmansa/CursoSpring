package com.openwebinars.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.openwebinars.springboot.model.Student;
import com.openwebinars.springboot.repo.StudentRepository;



@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET) 
	public String listStudents(Model model){
		
		model.addAttribute("listaEstudiantes", studentRepository.findAll());
		
		return "list";
	}
	
	
	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public String showForm(Model model) {
		
		Student student = new Student();
		model.addAttribute("studentForm", student);
		
		return "form";
		
	}

	@RequestMapping(value = "/addStudent", method = RequestMethod.POST)
	public String submit(@ModelAttribute("studentForm") Student student,  Model model) {

		studentRepository.save(student);
		return "redirect:/list";
	}

}
