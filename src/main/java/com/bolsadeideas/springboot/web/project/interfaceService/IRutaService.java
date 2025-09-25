package com.bolsadeideas.springboot.web.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.web.project.entity.Ruta;


public interface IRutaService {
	
	public List<Ruta> listar();
	public Optional<Ruta> listarId(int id);
	public int save(Ruta r);
	public void delete (int id);

}
