/**
 * 
 */
package com.javamodc4.springjwt.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.investigadores.dao.IEquipoDAO;
import com.javamodc4.springjwt.investigadores.dto.Equipo;

/**
 * @author aitor
 *
 */
@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipo> listarEquipo() {
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipo guardarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipo equipoById(int codigo) {
		return iEquipoDAO.findById(codigo).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(int codigo) {
		iEquipoDAO.deleteById(codigo);

	}

}
