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

import com.bolsadeideas.springboot.web.project.entity.Parada;
import com.bolsadeideas.springboot.web.project.interfaceService.IParadaService;

@Controller
@RequestMapping("/admin")
public class ParadaController {
	
	@Autowired
	private IParadaService service;
	
	@GetMapping("/listarParada")
	public String listar(Model model) {
		List<Parada> parada =  service.listar();
		model.addAttribute("parada", parada);
		model.addAttribute("titulo", "Listar Paradas");
		
		return "parada/listarAdmin";
	}
	
	@GetMapping("crearParada")
	public String crear(Model model) {
		model.addAttribute("parada", new Parada());
		model.addAttribute("titulo", "Crear Parada");
		
		return "parada/crear";
	}
	
	@PostMapping("saveParada")
	public String save(@Validated Parada p, Model model) {
		service.save(p);
		return "redirect:/admin/listarParada";
	}
	
	@GetMapping("editarParada/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Parada> parada = service.listarId(id);
		model.addAttribute("parada", parada);
		model.addAttribute("titulo", "Editar Parada");
		
		return "parada/crear";
	}
	
	@GetMapping("eliminarParada/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/listarParada"; // /Admin/listar
	}

	

}
