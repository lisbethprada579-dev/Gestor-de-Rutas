package com.bolsadeideas.springboot.web.project.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.bolsadeideas.springboot.web.project.entity.Usuario;

@Repository
public interface IUsuarioDao extends JpaRepository<Usuario, Long> {
	
	public Usuario findByUsername(String username);

}
