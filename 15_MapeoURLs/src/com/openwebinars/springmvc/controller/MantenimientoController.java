package com.openwebinars.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MantenimientoController {
	
	@RequestMapping("/closed")
	public String mantenimiento() {
		return "closed";
	}
	

}
