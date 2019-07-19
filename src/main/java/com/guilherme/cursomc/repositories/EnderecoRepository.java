package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.cursomc.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
