/**
 * 
 */
package com.javamodc4.springjwt.investigadores.service;

import java.util.List;

import com.javamodc4.springjwt.investigadores.dto.Investigador;

/**
 * @author aitor
 *
 */
public interface IInvestigadorService {
	// Metodos del CRUD
	public List<Investigador> listarInvestigador();

	public Investigador guardarInvestigador(Investigador investigador);

	public Investigador investigadorById(int id);

	public Investigador actualizarInvestigador(Investigador investigador);

	public void eliminarInvestigador(int id);
}
