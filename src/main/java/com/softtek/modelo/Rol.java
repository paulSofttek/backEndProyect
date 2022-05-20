package com.softtek.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rol")
public class Rol {
	
	@Id
    private Integer id_rol;
	
	@Column(name = "descripcion", nullable = true, length = 150)
    private String descripcion;
	
	@Column(name = "nombre", nullable = false, length = 15)
    private String nombre;

}
