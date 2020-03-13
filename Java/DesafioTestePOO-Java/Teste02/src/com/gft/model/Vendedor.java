package com.gft.model;

public class Vendedor extends Funcionario {
	
	@Override
	public double bonificacao() {
		return getSalario() + 3000;
	}

}
