package com.softtek.servicio.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.modelo.Medico;
import com.softtek.repositorio.IGenericRepo;
import com.softtek.repositorio.IMedicoRepo;
import com.softtek.servicio.IMedicoServicio;

@Service
public class MedicoServicioImpl extends CRUDImpl<Medico, Integer> implements IMedicoServicio {

	@Autowired
	private IMedicoRepo repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		return repo;
	}

}
