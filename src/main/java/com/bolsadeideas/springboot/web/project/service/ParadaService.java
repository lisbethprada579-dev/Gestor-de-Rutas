package com.bolsadeideas.springboot.web.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.project.entity.Parada;
import com.bolsadeideas.springboot.web.project.interfaceService.IParadaService;
import com.bolsadeideas.springboot.web.project.interfaces.IParada;

@Service
public class ParadaService implements IParadaService {
	
	@Autowired
	private IParada data;

	@Override
	public List<Parada> listar() {
		return (List<Parada>)data.findAll();
	}

	@Override
	public Optional<Parada> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Parada p) {
		int res = 0;
		Parada parada= data.save(p);
		
		if (!parada.equals(null)) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);
	}

}
