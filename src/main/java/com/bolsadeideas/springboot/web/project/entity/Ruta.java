package com.bolsadeideas.springboot.web.project.entity;



import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "ruta")
public class Ruta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	
	@Column(length = 500)
	private String recorrido;
	
	private String tipo;
	
	@ManyToMany
	@JoinTable(name="parada_ruta"
		,joinColumns=@JoinColumn(name= "id_ruta")
	,inverseJoinColumns=@JoinColumn(name= "id_parada")
	)
	private Set<Parada> parada;
	
	@ManyToMany
	@JoinTable(name="frecuencia_ruta"
		,joinColumns=@JoinColumn(name= "id_ruta")
	,inverseJoinColumns=@JoinColumn(name= "id_frecuencia")
	)
	private Set<Frecuencia> frecuencia;
	
	
	public Ruta() {
		// TODO Auto-generated constructor stub
	}


	public Ruta(int id, String nombre, String recorrido, String tipo, Set<Parada> parada, Set<Frecuencia> frecuencia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.recorrido = recorrido;
		this.tipo = tipo;
		this.parada = parada;
		this.frecuencia = frecuencia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getRecorrido() {
		return recorrido;
	}


	public void setRecorrido(String recorrido) {
		this.recorrido = recorrido;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Set<Parada> getParada() {
		return parada;
	}


	public void setParada(Set<Parada> parada) {
		this.parada = parada;
	}


	public Set<Frecuencia> getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(Set<Frecuencia> frecuencia) {
		this.frecuencia = frecuencia;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ruta other = (Ruta) obj;
		if (id != other.id)
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Ruta [id=" + id + ", nombre=" + nombre + ", recorrido=" + recorrido + ", tipo=" + tipo + ", parada="
				+ parada + ", frecuencia=" + frecuencia + "]";
	}



}
