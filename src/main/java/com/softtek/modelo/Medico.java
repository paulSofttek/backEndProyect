package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicos")
public class Medico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id_medico;

	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;

	@Column(name = "cedula", nullable = false, length = 12)
	String cedula;

	@Column(name = "foto_url", nullable = false, length = 70)
	String foto_url;

	@Column(name = "nombres", nullable = false, length = 155)
	String nombres;

	public Medico(Integer id_medico, String apellidos, String cedula, String foto_url, String nombres) {
		super();
		this.id_medico = id_medico;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.foto_url = foto_url;
		this.nombres = nombres;
	}

	public Medico() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId_medico() {
		return id_medico;
	}

	public void setId_medico(Integer id_medico) {
		this.id_medico = id_medico;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getFoto_url() {
		return foto_url;
	}

	public void setFoto_url(String foto_url) {
		this.foto_url = foto_url;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

}
