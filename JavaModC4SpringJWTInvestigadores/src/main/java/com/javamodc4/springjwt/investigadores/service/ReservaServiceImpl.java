/**
 * 
 */
package com.javamodc4.springjwt.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.investigadores.dao.IReservaDAO;
import com.javamodc4.springjwt.investigadores.dto.Reserva;

/**
 * @author aitor
 *
 */
@Service
public class ReservaServiceImpl implements IReservaService {
	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reserva> listarReserva() {
		return iReservaDAO.findAll();
	}

	@Override
	public Reserva guardarReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reserva reservaById(int id) {
		return iReservaDAO.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		iReservaDAO.deleteById(id);

	}

}
