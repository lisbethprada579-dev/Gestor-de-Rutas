package com.bolsadeideas.springboot.web.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.project.entity.Frecuencia;
import com.bolsadeideas.springboot.web.project.interfaceService.IFrecuenciaService;

@Controller
@RequestMapping("/admin")
public class FrecuenciaController {
	
	@Autowired
	private IFrecuenciaService service;
	
	@GetMapping("/listarFrecuencia")
	public String listar(Model model) {
		List<Frecuencia> frecuencia =  service.listar();
		model.addAttribute("frecuencia", frecuencia);
		model.addAttribute("titulo", "Listar Frecuencias");
		
		return "frecuencia/listarAdmin";
	}
	
	@GetMapping("crearFrecuencia")
	public String crear(Model model) {
		model.addAttribute("frecuencia", new Frecuencia());
		model.addAttribute("titulo", "Crear Frecuencia");
		
		return "frecuencia/crear";
	}
	
	@PostMapping("saveFrecuencia")
	public String save(@Validated Frecuencia f, Model model) {
		service.save(f);
		return "redirect:/admin/listarFrecuencia";
	}
	
	@GetMapping("editarFrecuencia/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Frecuencia>frecuencia = service.listarId(id);
		model.addAttribute("frecuencia", frecuencia);
		model.addAttribute("titulo", "Editar Frecuencia");
		
		return "frecuencia/crear";
	}
	
	@GetMapping("eliminarFrecuencia/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/listarFrecuencia"; // /Admin/listar
	}

}
