package com.bolsadeideas.springboot.web.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.web.project.entity.Frecuencia;

@Repository
public interface IFrecuencia extends CrudRepository<Frecuencia, Integer> {

}
