package com.softtek.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.modelo.Paciente;
import com.softtek.repositorio.IGenericRepo;
import com.softtek.repositorio.IPacienteRepo;
import com.softtek.servicio.IPacienteServicio;

@Service
public class PacienteServicioImpl extends CRUDImpl<Paciente, Integer> implements IPacienteServicio {

	@Autowired
	private IPacienteRepo repo;

	@Override
	protected IGenericRepo<Paciente, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

}
