package com.bolsadeideas.springboot.web.project.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolsadeideas.springboot.web.project.interfaceService.IpuntoRecargaService;
import com.bolsadeideas.springboot.web.project.interfaces.IPuntoRecarga;
import com.bolsadeideas.springboot.web.project.entity.PuntoRecarga;

@Service
public class PuntoRecargaService implements IpuntoRecargaService {
	
	@Autowired
	private IPuntoRecarga data;

	@Override
	public List<PuntoRecarga> listar() {
		return (List<PuntoRecarga>)data.findAll();
	}

	@Override
	public Optional<PuntoRecarga> listarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(PuntoRecarga pr) {
		int res = 0;
		PuntoRecarga puntoRecarga = data.save(pr);
		
		if (!puntoRecarga.equals(null)) {
			res = 1;
		}
		
		return res;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);	
	}

}
