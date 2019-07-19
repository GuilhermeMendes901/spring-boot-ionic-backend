package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.cursomc.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
