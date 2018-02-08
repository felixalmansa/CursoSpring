package com.openwebinars.springmvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.openwebinars.springmvc.model.Student;
import com.openwebinars.springmvc.repo.StudentRepository;



@Controller
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	
	@RequestMapping(value = "/list", method = RequestMethod.GET) 
	public String listStudents(Model model){
		
		model.addAttribute("listaEstudiantes", studentRepository.findAll());
		
		return "list";
	}
	
	@RequestMapping(value = "/find", method = RequestMethod.GET)
	public String search(@RequestParam(name="first_name", required=false) String firstName, 
			@RequestParam(name="last_name", required=true) String lastName, Model model) {
		
		List<Student> result = null;
		
		if (firstName.isEmpty() && lastName.isEmpty())
			result = studentRepository.findAll();
		else if (!firstName.isEmpty() && lastName.isEmpty())
			result = studentRepository.findByFirstName(firstName);
		else if (firstName.isEmpty() && !lastName.isEmpty())
			//result = studentRepository.findByLastName(lastName);
			//En su lugar, usamos la consulta que hemos definido nosotros
			result = studentRepository.findByLastNameStartsWith(lastName);
		else
			//result = studentRepository.findByFirstNameAndLastName(firstName, lastName);
			//En su lugar, usamos la consulta que hemos definido nosotros
			result = studentRepository.findByFirstNameOrLastName(firstName, lastName);
		
		model.addAttribute("listaEstudiantes", result);
		
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
	
	@RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
	public String showFormEdit(@PathVariable("id") Long id, Model model) {
		
		//Student student = studentRepository.findOne(id);
		//En su lugar, usamos la consulta que hemos definido nosotros
		Student student = studentRepository.findById(id);
		
		model.addAttribute("studentForm", student);
		model.addAttribute("op", "edit");
		
		return "form";
	}

	@RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable("id") Long id, Model model) {
		
		studentRepository.delete(id);
		
		return "redirect:/list";
	}

	
	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	@Transactional
	public String submitEdit(@ModelAttribute("studentForm") Student student,  Model model) {

		//studentRepository.save(student);
		//En su lugar, usamos la consulta que hemos definido nosotros
		studentRepository.setFirstNameAndLastNameFor(student.getFirstName(), student.getLastName(), student.getId());
		return "redirect:/list";
	}
	



}
