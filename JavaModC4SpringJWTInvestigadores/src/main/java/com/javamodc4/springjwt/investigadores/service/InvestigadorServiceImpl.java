/**
 * 
 */
package com.javamodc4.springjwt.investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javamodc4.springjwt.investigadores.dao.IInvestigadorDAO;
import com.javamodc4.springjwt.investigadores.dto.Investigador;

/**
 * @author aitor
 *
 */
@Service
public class InvestigadorServiceImpl implements IInvestigadorService {

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigador> listarInvestigador() {
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigador guardarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigador investigadorById(int id) {
		return iInvestigadorDAO.findById(id).get();
	}

	@Override
	public Investigador actualizarInvestigador(Investigador investigador) {
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(int id) {
		iInvestigadorDAO.deleteById(id);

	}

}
