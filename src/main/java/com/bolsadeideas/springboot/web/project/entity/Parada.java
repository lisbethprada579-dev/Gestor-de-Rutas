package com.bolsadeideas.springboot.web.project.entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "parada")
public class Parada {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_parada;
	
	private String ubicacion;
	
	public Parada() {
		// TODO Auto-generated constructor stub
	}

	public Parada(int id_parada, String ubicacion) {
		super();
		this.id_parada = id_parada;
		this.ubicacion = ubicacion;
	}

	public int getId_parada() {
		return id_parada;
	}

	public void setId_parada(int id_parada) {
		this.id_parada = id_parada;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	

}
