package com.bolsadeideas.springboot.web.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.web.project.entity.Ruta;

@Repository
public interface IRuta extends CrudRepository<Ruta, Integer> {

}
