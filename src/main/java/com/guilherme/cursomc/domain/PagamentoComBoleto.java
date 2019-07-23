package com.guilherme.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.guilherme.cursomc.domain.enums.EstadoPagamento;

//Não é necessario HashCod&Equals pelo fato de que ele a esta EXTENDS o pagamento e la ja esta sendo puxado o ID.

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Date dataVencimento;
	private Date dataPagamento;
	
	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedio, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedio);
		this.dataVencimento = dataVencimento;
		this.dataPagamento = dataPagamento;
	}
	
	public PagamentoComBoleto() {
		
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
