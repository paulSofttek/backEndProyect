package com.softtek.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.modelo.Medico;

@Service
public interface IMedicoServicio extends ICRUD<Medico, Integer> {
	Medico registrar(Medico m) throws Exception;

	Medico modificar(Medico m) throws Exception;

	List<Medico> listar();

	public Medico listarUno(Integer id) throws Exception;

	void eliminar(Integer id) throws Exception;
}
