package br.com.gft.model;

import java.util.List;

public class Loja {

	private String nome, cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGame;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public List<Livro> getLivros() {
		return livros;
	}
	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}
	public List<VideoGame> getVideoGame() {
		return videoGame;
	}
	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}
	
	public Loja() {
	}
	
	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGame) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGame = videoGame;
	}
	
	public void listaLivros() {
		System.out.println("\n====================================================================================================");
		System.out.println("Lista de Livros da loja " + getNome());
		if (livros.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque");
		} else {
			//estrutura padrão do For
			for (int i = 0; i < livros.size(); i++) {
				System.out.printf("Título: %s, Preço: R$ %.2f, Quantidade: %d, Autor: %s, Tema: %s, Páginas: %d \n", livros.get(i).getNome(),
						livros.get(i).getPreco(), livros.get(i).getQtd(), livros.get(i).getAutor(), livros.get(i).getTema(), livros.get(i).getQtdPag());
			}
		}
		System.out.println("====================================================================================================\n");
	}
	
	public void listaVideoGames() {
		System.out.println("====================================================================================================");
		System.out.println("Lista de Videogames da loja " + getNome());
		if (livros.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque");
		} else {	
			//Utilizando forEach
			for (VideoGame dados : videoGame) {
				String usado;
				if (dados.getUsado() == true) {
					usado = "sim";
				} else {
					usado = "não";
				}
				System.out.printf("Videogame: %s, Preço: R$ %.2f, Quantidade: %d, Marca: %s, Modelo: %s, Usado: %s \n", dados.getNome(), 
						dados.getPreco(), dados.getQtd(),dados.getMarca(), dados.getModelo(), usado);
			}
		}
		System.out.println("====================================================================================================\n");
	}
	
	public double calculaPatrimonio(){
		double soma = 0;
		for (VideoGame game : videoGame) {
			soma += game.getPreco()*game.getQtd();
		}
		for (Livro livro : livros) {
			soma += livro.getPreco()*livro.getQtd();
		}
		return soma;
	}

}
