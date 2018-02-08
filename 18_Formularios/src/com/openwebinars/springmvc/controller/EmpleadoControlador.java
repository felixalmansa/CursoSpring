package com.openwebinars.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.openwebinars.springmvc.model.Empleado;

@Controller
public class EmpleadoControlador {

	@RequestMapping(value = "/empleado", method = RequestMethod.GET)
	public String showForm(Model model) {
		
		Empleado empleado = new Empleado();
		model.addAttribute("empleadoForm", empleado);
		
		return "form";
		
	}

	@RequestMapping(value = "/addEmpleado", method = RequestMethod.POST)
	public String submit(@ModelAttribute("empleadoForm") Empleado empleado,  Model model) {
		model.addAttribute("empleado", empleado);
		return "view";
	}

}
