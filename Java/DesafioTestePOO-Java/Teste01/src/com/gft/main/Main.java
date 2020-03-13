package com.gft.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.gft.model.Pessoa;

public class Main {

	public static void main(String[] args) {
				
		Pessoa p1 = new Pessoa ("João", 15);
		Pessoa p2 = new Pessoa ("Leandro", 21);
		Pessoa p3 = new Pessoa ("Paulo", 17);
		Pessoa p4 = new Pessoa ("Jéssica", 18);
		
		List<Pessoa> pessoa = new ArrayList<>();
		pessoa.add(p1);
		pessoa.add(p2);
		pessoa.add(p3);
		pessoa.add(p4);
						
		System.out.printf("A pessoa mais velha tem: %d anos", PessoaMaisVelha(pessoa));
		
		RemoveMenores(pessoa);
		
		Search("Jéssica", pessoa);
	}
	
	static Pessoa pessoa = new Pessoa();
	
	public static int PessoaMaisVelha(List<Pessoa> p) {
		
		pessoa =  Collections.max(p, Comparator.comparing(x -> x.getIdade()));
				
		return pessoa.getIdade();
	}
	
	public static void RemoveMenores(List<Pessoa> p) {
		System.out.println("\n\nTamanho da lista antes da exclusão: " + p.size());
		System.out.println("----------------------------------");
		System.out.println("Pessoas na lista antes da exclusão");
		p.forEach(x -> System.out.printf("%s  %d anos\n", x.getNome(), x.getIdade()));
		/*for (Pessoa dados : p){
			System.out.printf("%s  %d anos\n", dados.getNome(), dados.getIdade());			
		}*/
		System.out.println("----------------------------------");
		
		/*Removendo com forEach
		for (Pessoa pess : new ArrayList<>(p)) {
			if (pess.getIdade()<18) {
				p.remove(pess);
			}
		}*/		
		
		//Removendo com Lambda
		p.removeIf(x -> x.getIdade() < 18);
		
		System.out.println("\nTamanho da lista após a exclusão: " + p.size());
		System.out.println("----------------------------------");
		System.out.println("Pessoas na lista após a exclusão");
		p.forEach(x -> System.out.printf("%s  %d anos\n", x.getNome(), x.getIdade()));
		/*for (Pessoa dados : p){
			System.out.printf("%s  %d anos\n", dados.getNome(), dados.getIdade());			
		}*/
		System.out.println("----------------------------------");
	}
	
	public static void Search(String nome, List<Pessoa> p) {
		p.stream().filter(x -> x.getNome() == nome).
		forEach(x -> System.out.printf("\nO nome %s foi encontrado. Sua idade é: %d anos\n", x.getNome(), x.getIdade()));
		/*for (Pessoa dados : p){
			if (dados.getNome() == nome) {
				System.out.printf("\nO nome %s foi encontrado. Sua idade é: %d anos\n", dados.getNome(), dados.getIdade());
			}				
		}*/
	}

}
