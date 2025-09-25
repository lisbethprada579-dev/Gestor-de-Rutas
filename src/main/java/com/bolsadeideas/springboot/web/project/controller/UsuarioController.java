package com.bolsadeideas.springboot.web.project.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.project.entity.PuntoRecarga;
import com.bolsadeideas.springboot.web.project.entity.Usuario;
import com.bolsadeideas.springboot.web.project.interfaceService.IUsuarioService;

@Controller
@RequestMapping
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/login")
	public String login(Model model) {
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("titulo", "Log In");
		
		return "login";
	}
	
	@GetMapping("/admin/listarUsuario")
	public String listar(Model model) {
		List<Usuario> usuario =  usuarioService.listar();
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Listar Usuarios");
		
		return "usuario/listarAdmin";
	}
	@GetMapping("/admin/crearUsuario")
	public String crear(Model model) {
		model.addAttribute("usuario", new Usuario());
		model.addAttribute("titulo", "Crear Usuario");
		
		return "usuario/crear";
	}
	
	@PostMapping("/admin/saveUsuario")
	public String save(@Validated  @ModelAttribute  Usuario usuario,BindingResult result , Model model) {
		
		if(result.hasErrors()) {
			return "redirect:/admin/registro";
		}else {
			model.addAttribute("usuario",usuarioService.save(usuario));
		}
		
		return "redirect:/admin/listarUsuario";
	}
	
	@GetMapping("/admin/editarUsuario/{id}")
	public String editar(@PathVariable long id, Model model) {
		Optional<Usuario>usuario = usuarioService.listarId(id);
		model.addAttribute("usuario", usuario);
		model.addAttribute("titulo", "Editar Usuario");
		
		return "usuario/crear";
	}
	
	@GetMapping("/admin/eliminarUsuario/{id}")
	public String delete(Model model, @PathVariable int id) {
		usuarioService.delete(id);
		return "redirect:/admin/listarUsuario"; // /Admin/listar
	}

}
