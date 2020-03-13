package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor, tema;
	private int qtdPag;
	
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	
	public Livro() {
		super();
	}
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		setAutor(autor);
		setTema(tema);
		setQtdPag(qtdPag);
	}
	
	
	@Override
	public double calculaImposto() {
		double imposto = 0;
		if (getTema() == "educativo") {
			System.out.println("Livro educativo não tem imposto: " + getNome());
		} else {
			imposto = getPreco()*0.1;
			System.out.printf("Impostos: R$ %.2f sobre o livro %s \n" , imposto , getNome());
		}
		return imposto;
	}
	
	

}
