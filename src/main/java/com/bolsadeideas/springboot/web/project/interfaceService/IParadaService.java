package com.bolsadeideas.springboot.web.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.web.project.entity.Parada;

public interface IParadaService {
	
	public List<Parada> listar();
	public Optional<Parada> listarId(int id);
	public int save(Parada p);
	public void delete (int id);


}
