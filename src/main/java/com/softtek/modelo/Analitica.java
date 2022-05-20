package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "analiticas")
public class Analitica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_analitica;

	@Column(name = "descripcion", nullable = false, length = 150)
	String descripcion;

	@Column(name = "nombre", nullable = false, length = 50)
	String nombre;

	public Analitica(Integer id_analitica, String descripcion, String nombre) {
		super();
		this.id_analitica = id_analitica;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	public Analitica() {
		super();
	}

	public Integer getId_analitica() {
		return id_analitica;
	}

	public void setId_analitica(Integer id_analitica) {
		this.id_analitica = id_analitica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
