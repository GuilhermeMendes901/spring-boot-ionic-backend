package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.guilherme.cursomc.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

	@Transactional(readOnly=true) //@Transactional, faz com que o metodo que passei embaixo não precise ser necessariamente envolvida diretamente com o banco de dados.
	Cliente findByEmail(String email); //só esse metodo "FindByEmail só ele já é necessario para achar um email no meu banco, logico passando uma string email como paramentro.
}
