package com.softtek.servicio.impl;

import java.util.List;
import java.util.Optional;

import com.softtek.repositorio.IGenericRepo;

public abstract class CRUDImpl<T, ID> {

	protected abstract IGenericRepo<T, ID> getRepo();

	public T registrar(T t) throws Exception {
		return getRepo().save(t);
	}

	public T modificar(T t) throws Exception {
		return getRepo().save(t);
	}

	public List<T> listar() {
		return getRepo().findAll();
	}

	public T listarUno(ID id) throws Exception {
		Optional<T> t = getRepo().findById(id);
		return t.isPresent() ? t.get() : null;

	}

	public void eliminar(ID id) throws Exception {
		getRepo().deleteById(id);
		;
	}

}
