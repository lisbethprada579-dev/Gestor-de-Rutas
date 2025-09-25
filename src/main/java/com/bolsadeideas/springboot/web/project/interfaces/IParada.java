package com.bolsadeideas.springboot.web.project.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.web.project.entity.Parada;

@Repository
public interface IParada extends CrudRepository<Parada, Integer> {

}
