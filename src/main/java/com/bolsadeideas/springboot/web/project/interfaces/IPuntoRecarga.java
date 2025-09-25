package com.bolsadeideas.springboot.web.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.web.project.entity.PuntoRecarga;

@Repository
public interface IPuntoRecarga extends CrudRepository<PuntoRecarga, Integer> {

}
