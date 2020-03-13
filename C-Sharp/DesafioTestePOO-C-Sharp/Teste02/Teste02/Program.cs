using System;
using Teste02.com.gft.model;

namespace Teste02
{
    class Program
    {
        static void Main(string[] args)
        {
			Gerente g = new Gerente();
			Supervisor s = new Supervisor();
			Vendedor v = new Vendedor();

			g.Nome = "João";
			g.Idade = 50;
			g.Salario = 7000;

			Console.WriteLine("Gerente {0}, {1} anos recebe {2:0.00}", g.Nome, g.Idade, g.Salario);
			Console.WriteLine("Salario do Gerente após bonificação: {0:0.00}", g.bonificacao());
			Console.WriteLine("-------------------------------------------------------------------");

			s.Nome = "Maria";
			s.Idade = 45;
			s.Salario = 5000;

			Console.WriteLine("Supervisor {0}, {1} anos recebe {2:0.00}", s.Nome, s.Idade, s.Salario);
			Console.WriteLine("Salario do Supervisor após bonificação: {0:0.00}", s.bonificacao());
			Console.WriteLine("-------------------------------------------------------------------");

			v.Nome = "José";
			v.Idade = 30;
			v.Salario = 3500;

			Console.WriteLine("Vendedor {0}, {1} anos recebe {2:0.00}", v.Nome, v.Idade, v.Salario);
			Console.WriteLine("Salario do Vendedor após bonificação: {0:0.00}", v.bonificacao());

			Console.ReadKey();
		}
    }
}
