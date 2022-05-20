package com.softtek.servicio;

import java.util.List;

import org.springframework.stereotype.Service;

import com.softtek.dto.PacienteDTO;
import com.softtek.modelo.Paciente;

@Service
public interface IPacienteServicio extends ICRUD<Paciente, Integer> {
	Paciente registrar(Paciente p) throws Exception;

	Paciente modificar(Paciente p) throws Exception;

	List<Paciente> listar();

	public Paciente listarUno(Integer id) throws Exception;

	void eliminar(Integer id) throws Exception;
}
