package com.bolsadeideas.springboot.web.project.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bolsadeideas.springboot.web.project.entity.Usuario;
import com.bolsadeideas.springboot.web.project.interfaceService.IUsuarioService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/index")
	public String index(Authentication auth, HttpSession session, Model model) {
		String username = auth.getName();
		
		model.addAttribute("titulo", "Administrador");
		
		if(session.getAttribute("usuario") == null) {
			Usuario usuario = usuarioService.findByUsername(username);
			usuario.setPassword(null);
			session.setAttribute("usuario", usuario);
		}
		
		return "admin";
	}

}
