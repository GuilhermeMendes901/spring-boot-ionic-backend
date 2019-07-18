package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.guilherme.cursomc.domain.Produto;

//JpaRepository serve para poder acessar o dados passados dentro do <>.

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> { 

}
