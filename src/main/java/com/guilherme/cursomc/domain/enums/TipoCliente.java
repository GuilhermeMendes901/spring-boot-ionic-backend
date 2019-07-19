package com.guilherme.cursomc.domain.enums;

/*Todo esse role serve para que quando um futuro desenvolvedor for mecher, ele acabar nao fazendo merda no codigo
em questão da ordem 0, 1, 2, 3...*/

public enum TipoCliente {

	PESSOAFISICA(1,"Pessoa Fisíca"),
	PESSOAJURIDICA(2, "Pessoa Juridica");
	
	private int cod;
	private String descricao;
	
	private TipoCliente(int cod, String descricao) {
		this.cod=cod;
		this.descricao=descricao;
	}
	
	public int getCod() {
		return cod;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public static TipoCliente toEnum(Integer cod) {
		
		if(cod==null) {
			return null;
		}
		
		for(TipoCliente x : TipoCliente.values()) {
			if(cod.equals(x.getCod())) {
				return x;
			}
		}
		
		throw new IllegalArgumentException("Id inválido: " + cod);
	}
}
