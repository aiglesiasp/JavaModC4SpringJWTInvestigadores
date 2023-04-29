/**
 * 
 */
package com.javamodc4.springjwt.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.investigadores.dto.Equipo;

/**
 * @author aitor
 *
 */
public interface IEquipoDAO extends JpaRepository<Equipo, Integer> {

}
