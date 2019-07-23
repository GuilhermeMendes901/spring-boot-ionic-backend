package com.guilherme.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.guilherme.cursomc.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer>{

}
