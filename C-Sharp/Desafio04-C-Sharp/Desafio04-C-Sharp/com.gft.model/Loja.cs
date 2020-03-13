using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio04_C_Sharp.com.gft.model
{
    class Loja
    {
		public string Nome { get; set; }
		public string Cnpj { get; set; }
		internal List<Livro> Livros { get; set; }
		internal List<VideoGame> VideoGame { get; set; }

		public Loja()
        {
        }

		public Loja(string nome, string cnpj, List<Livro> livros, List<VideoGame> videoGame)
		{
			Nome = nome;
			Cnpj = cnpj;
			Livros = livros;
			VideoGame = videoGame;
		}

		public void listaLivros()
		{
			Console.WriteLine("====================================================================================================");
			Console.WriteLine("Lista de Livros da loja " + Nome);
			if (Livros.Count == 0)
			{
				Console.WriteLine("A loja não tem livros no seu estoque");
			}
			else
			{
				foreach (Livro dados in Livros)
				{
					Console.WriteLine("Título: {0}, Preço: R$ {1:0.00}, Quantidade: {2}, Autor: {3}, Tema: {4}, Páginas: {5}", dados.Nome,
							dados.Preco, dados.Qtd, dados.Autor, dados.Tema, dados.QtdPag);
				}
			}
			Console.WriteLine("====================================================================================================");
		}

		public void listaVideoGames()
		{
			Console.WriteLine("====================================================================================================");
			Console.WriteLine("Lista de Videogames da loja " + Nome);
			if (VideoGame.Count == 0)
			{
				Console.WriteLine("A loja não tem video-games no seu estoque");
			}
			else
			{
				//Utilizando forEach
				foreach (VideoGame dados in VideoGame)
				{
					String usado;
					if (dados.IsUsado == true)
					{
						usado = "sim";
					}
					else
					{
						usado = "não";
					}
					Console.WriteLine("Videogame: {0}, Preço: R$ {1:0.00}, Quantidade: {2}, Marca: {3}, Modelo: {4}, Usado: {5}", dados.Nome,
							dados.Preco, dados.Qtd, dados.Marca, dados.Modelo, usado);
				}
			}
			Console.WriteLine("====================================================================================================");
		}

		public double calculaPatrimonio()
		{
			double soma = 0;
			foreach (VideoGame game in VideoGame)
			{
				soma += game.Preco * game.Qtd;
			}
			foreach (Livro livro in Livros)
			{
				soma += livro.Preco * livro.Qtd;
			}
			return soma;
		}
	}
}
