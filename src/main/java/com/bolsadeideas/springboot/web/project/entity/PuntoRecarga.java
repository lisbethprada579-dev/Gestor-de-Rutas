package com.bolsadeideas.springboot.web.project.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "punto_de_recarga")
public class PuntoRecarga {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String ubicacion;
	
	public PuntoRecarga() {
		// TODO Auto-generated constructor stub
	}

	public PuntoRecarga(int id, String ubicacion) {
		super();
		this.id = id;
		this.ubicacion = ubicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}
