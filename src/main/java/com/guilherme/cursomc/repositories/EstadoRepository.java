package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.cursomc.domain.Estado;

public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
