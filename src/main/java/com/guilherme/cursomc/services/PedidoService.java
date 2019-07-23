package com.guilherme.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilherme.cursomc.domain.Pedido;
import com.guilherme.cursomc.repositories.PedidoRepository;
import com.guilherme.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired //Serve para gerar dependencia
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Pedido obj = repo.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! ID: " + id + ", Tipo: " +
					Pedido.class.getName());
		}
		return obj;
	}
}
