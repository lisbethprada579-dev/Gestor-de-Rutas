package com.bolsadeideas.springboot.web.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.project.entity.Frecuencia;
import com.bolsadeideas.springboot.web.project.interfaceService.IFrecuenciaService;
import com.bolsadeideas.springboot.web.project.interfaces.IFrecuencia;

@Service
public class FrecuenciaService implements IFrecuenciaService {
	
	@Autowired
	private IFrecuencia data;

	@Override
	public List<Frecuencia> listar() {
		return (List<Frecuencia>)data.findAll();
	}

	@Override
	public Optional<Frecuencia> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Frecuencia f) {
		int res = 0;
		Frecuencia frecuencia = data.save(f);
		
		if (!frecuencia.equals(null)) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
