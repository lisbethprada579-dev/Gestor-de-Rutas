package com.bolsadeideas.springboot.web.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.project.entity.Ruta;
import com.bolsadeideas.springboot.web.project.interfaceService.IRutaService;
import com.bolsadeideas.springboot.web.project.interfaces.IRuta;

@Service
public class RutaService implements IRutaService {
	
	@Autowired
	private IRuta data;

	@Override
	public List<Ruta> listar() {
		return (List<Ruta>)data.findAll();
	}

	@Override
	public Optional<Ruta> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Ruta r) {
		int res = 0;
		Ruta ruta = data.save(r);
		
		if (!ruta.equals(null)) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
