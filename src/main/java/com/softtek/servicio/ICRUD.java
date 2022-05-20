package com.softtek.servicio;

import java.util.List;

public interface ICRUD<T, ID> {
	public T registrar(T t) throws Exception;
	
	public T modificar(T p) throws Exception;

	public List<T> listar() throws Exception;

	public T listarUno(Integer id) throws Exception;

	public void eliminar(Integer id) throws Exception;
}
