package com.gft.model;

public class Gerente extends Funcionario {
	
	@Override
	public double bonificacao() {
		return getSalario() + 10000;
	}

}
