package com.bolsadeideas.springboot.web.project.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controllers {
	
	
	@GetMapping({"/","/index"})
	public String incio(Model model) {
		model.addAttribute("titulo", "Área de influencia: UTS");
		
		return "inicio";
	}
	
	
}
