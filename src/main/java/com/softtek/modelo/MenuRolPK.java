package com.softtek.modelo;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class MenuRolPK implements Serializable{

	@ManyToOne
	@JoinColumn(name = "id_menu", nullable = false)
	private Consulta menu;

	@ManyToOne
	@JoinColumn(name = "id_rol", nullable = false)
	private Rol rol;

	public MenuRolPK() {
		// TODO Auto-generated constructor stub
	}

	public MenuRolPK(Consulta menu, Rol rol) {
		super();
		this.menu = menu;
		this.rol = rol;
	}

	public Consulta getMenu() {
		return menu;
	}

	public void setMenu(Consulta menu) {
		this.menu = menu;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	@Override
	public int hashCode() {
		return Objects.hash(menu, rol);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MenuRolPK other = (MenuRolPK) obj;
		return Objects.equals(menu, other.menu) && Objects.equals(rol, other.rol);
	}

}
