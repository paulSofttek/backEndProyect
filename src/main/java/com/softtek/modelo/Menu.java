package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class Menu {
	@Id
	private Integer id_menu;

	@Column(name = "icono", nullable = true, length = 20)
	private String icono;

	@Column(name = "nombre", nullable = true, length = 20)
	private String nombre;

	@Column(name = "url", nullable = true, length = 50)
	private String url;
	

	

	public Menu() {
		// TODO Auto-generated constructor stub
	}

	public Menu(Integer id_menu, String icono, String nombre, String url) {
		super();
		this.id_menu = id_menu;
		this.icono = icono;
		this.nombre = nombre;
		this.url = url;
	}

	@Override
	public String toString() {
		return "Menu [id_menu=" + id_menu + ", icono=" + icono + ", nombre=" + nombre + ", url=" + url + "]";
	}

	public Integer getId_menu() {
		return id_menu;
	}

	public void setId_menu(Integer id_menu) {
		this.id_menu = id_menu;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
