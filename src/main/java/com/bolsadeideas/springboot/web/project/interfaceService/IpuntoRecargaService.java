package com.bolsadeideas.springboot.web.project.interfaceService;

import java.util.List;
import java.util.Optional;

import com.bolsadeideas.springboot.web.project.entity.PuntoRecarga;

public interface IpuntoRecargaService {
	
	public List<PuntoRecarga> listar();
	public Optional<PuntoRecarga>  listarId(int id);
	public int save(PuntoRecarga pr);
	public void delete (int id);

}
