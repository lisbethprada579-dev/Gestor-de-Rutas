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

import com.bolsadeideas.springboot.web.project.entity.Ruta;
import com.bolsadeideas.springboot.web.project.entity.Frecuencia;
import com.bolsadeideas.springboot.web.project.entity.Parada;
import com.bolsadeideas.springboot.web.project.interfaceService.IFrecuenciaService;
import com.bolsadeideas.springboot.web.project.interfaceService.IParadaService;
import com.bolsadeideas.springboot.web.project.interfaceService.IRutaService;

@Controller
@RequestMapping
public class RutaController {
	
	@Autowired
	private IRutaService service;
	
	@Autowired
	private IParadaService serviceParada;
	
	@Autowired
	private IFrecuenciaService serviceFrecuencia;	
	
	@GetMapping("/listarRuta")
	public String listarConsultante(Model model) {
		
		List<Ruta> ruta =  service.listar();
		model.addAttribute("ruta", ruta);
		model.addAttribute("titulo", "Listar Rutas");

		return "ruta/listar";
	}
	
	@GetMapping("/admin/listarRuta")
	public String listar(Model model) {
		
		List<Ruta> ruta =  service.listar();
		model.addAttribute("ruta", ruta);
		model.addAttribute("titulo", "Listar Rutas");

		return "ruta/listarAdmin";
	}
	
	@GetMapping("/admin/crearRuta")
	public String crear(Model model) {
		
		model.addAttribute("titulo", "Crear Ruta");
		
		List<Parada> parada =  serviceParada.listar();
		model.addAttribute("parada", parada);
		
		List<Frecuencia> frecuencia =  serviceFrecuencia.listar();
		model.addAttribute("frecuencia", frecuencia);	
		
		model.addAttribute("ruta", new Ruta());
		return "ruta/crear";
	}
	
	@PostMapping("/admin/saveRuta")
	public String save(@Validated Ruta r, Model model) {
		service.save(r);
		return "redirect:/admin/listarRuta";
	}
	
	@GetMapping("/admin/editarRuta/{id}")
	public String editar(@PathVariable int id, Model model) {
		Optional<Ruta>ruta = service.listarId(id);
		model.addAttribute("ruta", ruta);
		
		List<Parada> parada =  serviceParada.listar();
		model.addAttribute("parada", parada);
		
		List<Frecuencia> frecuencia =  serviceFrecuencia.listar();
		model.addAttribute("frecuencia", frecuencia);	
		
		model.addAttribute("titulo", "Editar Ruta");
	
		return "ruta/crear";
	}
	
	@GetMapping("/admin/eliminarRuta/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/admin/listarRuta"; // /Admin/listar
	}

}
