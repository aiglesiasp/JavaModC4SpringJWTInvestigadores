/**
 * 
 */
package com.javamodc4.springjwt.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.investigadores.dto.Facultad;

/**
 * @author aitor
 *
 */
public interface IFacultadDAO extends JpaRepository<Facultad, Integer> {

}
