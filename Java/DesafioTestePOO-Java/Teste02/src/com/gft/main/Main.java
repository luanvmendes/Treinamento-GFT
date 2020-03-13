package com.gft.main;

import com.gft.model.Gerente;
import com.gft.model.Supervisor;
import com.gft.model.Vendedor;;

public class Main {

	public static void main(String[] args) {
		
		Gerente g = new Gerente();
		Supervisor s = new Supervisor();
		Vendedor v = new Vendedor();
		
		g.setNome("Jo�o");
		g.setIdade(50);
		g.setSalario(7000);
		
		System.out.printf("Gerente %s, %d anos recebe %.2f \n", g.getNome(), g.getIdade(), g.getSalario());
		System.out.println("Salario do Gerente ap�s bonifica��o: " + g.bonificacao());
		
		s.setNome("Maria");
		s.setIdade(45);
		s.setSalario(5000);
		
		System.out.printf("Supervisor %s, %d anos recebe %.2f \n", s.getNome(), s.getIdade(), s.getSalario());
		System.out.println("Salario do Supervisor ap�s bonifica��o: " + s.bonificacao());
		
		v.setNome("Jos�");
		v.setIdade(30);
		v.setSalario(3500);
		
		System.out.printf("Vendedor %s, %d anos recebe %.2f \n", v.getNome(), v.getIdade(), v.getSalario());
		System.out.println("Salario do Vendedor ap�s bonifica��o: " + v.bonificacao());

	}

}
