using System;
using System.Collections.Generic;
using Teste01.com.gft.model;
using System.Linq;

namespace Teste01
{
    class Program
    {
        static void Main(string[] args)
        {
			Pessoa p1 = new Pessoa("João", 15);
			Pessoa p2 = new Pessoa("Leandro", 21);
			Pessoa p3 = new Pessoa("Paulo", 17);
			Pessoa p4 = new Pessoa("Jéssica", 18);

			List<Pessoa> pessoa = new List<Pessoa>();
			pessoa.Add(p1);
			pessoa.Add(p2);
			pessoa.Add(p3);
			pessoa.Add(p4);
			
			Console.WriteLine("A pessoa mais velha tem: {0} anos", PessoaMaisVelha(pessoa));

			RemoveMenores(pessoa);

			Search("Jéssica", pessoa);

			Console.ReadKey();
		}

		public static int PessoaMaisVelha(List<Pessoa> p)
		{
			int maisVelho = p.Max(x => x.Idade);
			Pessoa p1 = new Pessoa();

			return maisVelho;
		}

		public static void RemoveMenores(List<Pessoa> p)
		{
			Console.WriteLine("Tamanho da lista antes da exclusão: {0}", p.Count);
			Console.WriteLine("----------------------------------");
			Console.WriteLine("Pessoas na lista antes da exclusão");

			/*Utilizando LINQ
			var resultado = from pessoa in p select pessoa.Nome + "  " + pessoa.Idade + " anos"; 
			foreach (string pessoa in resultado)
			{
				Console.WriteLine(pessoa);
			}*/

			//Utilizando Lambda
			p.ForEach(x => Console.WriteLine("{0}  {1} anos", x.Nome, x.Idade));
			
			Console.WriteLine("----------------------------------");

			/*Resolução pelo método For			  
			 for (int i = 0; i< p.Count; i++)
			{
				if (Idade < 18)
				{
					p.RemoveAt(i);
				}
			}*/

			/*Resolução por ForEach			 
			foreach (Pessoa dados in p.ToArray())
			{
				if (dados.Idade < 18)
				{
					p.Remove(dados);
				}
			}*/

			//Resolução Lambda
			p.RemoveAll(x => x.Idade < 18);
			Console.WriteLine("Tamanho da lista após a exclusão: " + p.Count);
			Console.WriteLine("----------------------------------");
			Console.WriteLine("Pessoas na lista após a exclusão"); 
			p.ForEach(x => Console.WriteLine("{0}  {1} anos", x.Nome, x.Idade));
			Console.WriteLine("----------------------------------");
		}

		public static void Search(String nome, List<Pessoa> p)
		{
			p = p.FindAll(delegate (Pessoa p) { return p.Nome == nome; });
			p.ForEach(delegate (Pessoa p)
			{
				Console.WriteLine("O nome {0} foi encontrado. Sua idade é: {1} anos", p.Nome, p.Idade);
			});

			/*Resolução alternativa
			foreach (Pessoa dados in p)
			{
				if (dados.Nome == nome)
				{
					Console.WriteLine("O nome {0} foi encontrado. Sua idade é: {1} anos", dados.Nome, dados.Idade);
				}
			}*/
		}
	}
}
