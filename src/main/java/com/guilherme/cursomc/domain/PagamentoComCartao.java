package com.guilherme.cursomc.domain;

import javax.persistence.Entity;

import com.guilherme.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Integer numeroDeParcelas;

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedio, Integer numeroDeParcelas) {
		super(id, estado, pedio);
		this.numeroDeParcelas = numeroDeParcelas;
	}
	
	public PagamentoComCartao() {
		
	}

	public Integer getNumeroDeParcelas() {
		return numeroDeParcelas;
	}

	public void setNumeroDeParcelas(Integer numeroDeParcelas) {
		this.numeroDeParcelas = numeroDeParcelas;
	}
}
