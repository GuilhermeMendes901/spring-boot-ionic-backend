package com.guilherme.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.cursomc.domain.Cliente;
import com.guilherme.cursomc.repositories.ClienteRepository;
import com.guilherme.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {

	@Autowired //Serve para gerar dependencia
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Cliente obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " +
					Cliente.class.getName());
		}
		return obj;
	}
}
