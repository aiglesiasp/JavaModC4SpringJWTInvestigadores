/**
 * 
 */
package com.javamodc4.springjwt.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.investigadores.dto.Investigador;

/**
 * @author aitor
 *
 */
public interface IInvestigadorDAO extends JpaRepository<Investigador, Integer> {

}
