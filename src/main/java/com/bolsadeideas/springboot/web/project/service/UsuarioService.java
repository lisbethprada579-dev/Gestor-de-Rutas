package com.bolsadeideas.springboot.web.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.project.entity.Ruta;
import com.bolsadeideas.springboot.web.project.entity.Usuario;
import com.bolsadeideas.springboot.web.project.interfaceService.IUsuarioService;
import com.bolsadeideas.springboot.web.project.interfaces.IUsuarioDao;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Autowired
	private IUsuarioDao usuarioDao;

	@Override
	public Usuario findByUsername(String username) {

		return usuarioDao.findByUsername(username);
	}

	@Override
	public Usuario save(Usuario u) {
		u.setPassword(passwordEncoder.encode(u.getPassword()));
		return usuarioDao.save(u);
	}

	@Override
	public List<Usuario> listar() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Override
	public Optional<Usuario> listarId(long id) {
		return usuarioDao.findById(id);
	}

	@Override
	public void delete(long id) {
		usuarioDao.deleteById(id);

	}

}
