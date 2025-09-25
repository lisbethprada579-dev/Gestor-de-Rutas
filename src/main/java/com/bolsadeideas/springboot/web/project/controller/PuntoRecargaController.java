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

import com.bolsadeideas.springboot.web.project.interfaceService.IpuntoRecargaService;
import com.bolsadeideas.springboot.web.project.entity.PuntoRecarga;

@Controller
@RequestMapping
public class PuntoRecargaController {
	
	@Autowired
	private IpuntoRecargaService service;
	
	@GetMapping("/listarPuntoRecarga")
	public String listarConsultante(Model model) {
		List<PuntoRecarga> puntosRecarga =  service.listar();
		model.addAttribute("puntosRecarga", puntosRecarga);
		model.addAttribute("titulo", "Listar Puntos de Recarga");
		
		return "puntoRecarga/listar";
	}
	
	@GetMapping("/admin/listarPuntoRecarga")
	public String listar(Model model) {
		List<PuntoRecarga> puntosRecarga =  service.listar();
		model.addAttribute("puntosRecarga", puntosRecarga);
		model.addAttribute("titulo", "Listar Puntos de Recarga");
		
		return "puntoRecarga/listarAdmin";
	}
	
	@GetMapping("/admin/crearPuntoRecarga")
	public String crear(Model model) {
		model.addAttribute("puntoRecarga", new PuntoRecarga());
		model.addAttribute("titulo", "Crear Punto de Recarga");
		
		return "puntoRecarga/crear";
	}
	
	@PostMapping("/admin/savePuntoRecarga")
	public String save(@Validated PuntoRecarga pr, Model model) {
		service.save(pr);
		return "redirect:/admin/listarPuntoRecarga";
	}
	
	@GetMapping("/admin/editarPuntoRecarga/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<PuntoRecarga>puntoRecarga = service.listarId(id);
		model.addAttribute("puntoRecarga", puntoRecarga);
		model.addAttribute("titulo", "Editar Punto de Recarga");
		
		return "puntoRecarga/crear";
	}
	
	@GetMapping("/admin/eliminarPuntoRecarga/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/listarPuntoRecarga"; // /Admin/listar
	}

}
