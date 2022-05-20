package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private Integer id_usuario;

	@Column(name = "estado", nullable = false)
	private boolean estado;

	@Column(name = "clave", nullable = false, length = 60)
	private String clave;

	@Column(name = "nombre", nullable = false, length = 255)
	private boolean nombre;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", estado=" + estado + ", clave=" + clave + ", nombre=" + nombre
				+ "]";
	}

	public Usuario(Integer id_usuario, boolean estado, String clave, boolean nombre) {
		super();
		this.id_usuario = id_usuario;
		this.estado = estado;
		this.clave = clave;
		this.nombre = nombre;
	}

	public Integer getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Integer id_usuario) {
		this.id_usuario = id_usuario;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public boolean isNombre() {
		return nombre;
	}

	public void setNombre(boolean nombre) {
		this.nombre = nombre;
	}

}
