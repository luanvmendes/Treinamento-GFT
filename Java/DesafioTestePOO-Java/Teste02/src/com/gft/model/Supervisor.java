package com.gft.model;

public class Supervisor extends Funcionario {

	@Override
	public double bonificacao() {
		return getSalario() + 5000;
	}
	
}
