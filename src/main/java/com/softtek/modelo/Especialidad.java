package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "especialidades")
public class Especialidad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_especialidad;

	@Column(name = "descripcion", nullable = false, length = 50)
	String descripcion;

	@Column(name = "nombre", nullable = false, length = 50)
	String nombre;

	public Especialidad() {
		// TODO Auto-generated constructor stub
	}

	public Especialidad(Integer id_especialidad, String descripcion, String nombre) {
		super();
		this.id_especialidad = id_especialidad;
		this.descripcion = descripcion;
		this.nombre = nombre;
	}

	public Integer getId_especialidad() {
		return id_especialidad;
	}

	public void setId_especialidad(Integer id_especialidad) {
		this.id_especialidad = id_especialidad;
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
