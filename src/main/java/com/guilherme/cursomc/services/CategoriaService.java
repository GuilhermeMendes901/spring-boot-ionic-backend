package com.guilherme.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.cursomc.domain.Categoria;
import com.guilherme.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired //Serve para gerar dependencia
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		return obj;
	}
}
