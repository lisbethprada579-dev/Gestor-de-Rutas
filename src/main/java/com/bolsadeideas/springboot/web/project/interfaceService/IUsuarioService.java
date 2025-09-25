package com.bolsadeideas.springboot.web.project.interfaceService;

import java.util.List;
import java.util.Optional;


import com.bolsadeideas.springboot.web.project.entity.Usuario;

public interface IUsuarioService {
	public Usuario findByUsername(String username);
	public Usuario save(Usuario u);
	public List<Usuario> listar();
	public Optional<Usuario> listarId(long id);
	public void delete (long id);
}
