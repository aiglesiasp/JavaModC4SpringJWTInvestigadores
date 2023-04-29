package com.javamodc4.springjwt.investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javamodc4.springjwt.investigadores.dto.Reserva;

public interface IReservaDAO extends JpaRepository<Reserva, Integer> {

}
