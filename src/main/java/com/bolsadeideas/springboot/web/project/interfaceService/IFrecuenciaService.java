package com.bolsadeideas.springboot.web.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.web.project.entity.Frecuencia;


public interface IFrecuenciaService {
	
	public List<Frecuencia> listar();
	public Optional<Frecuencia> listarId(int id);
	public int save(Frecuencia f);
	public void delete (int id);

}
