using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio01.main
{
    class Program
    {
        static void Main(string[] args)
        {
			com.gft.model.Veiculo carro = new com.gft.model.Veiculo();

			Console.WriteLine("Qual a marca do seu carro?");
			carro.Marca = Console.ReadLine();
			Console.WriteLine("Qual o modelo?");
			carro.Modelo = Console.ReadLine();
			Console.Write("Insira a placa do seu veículo: ");
			carro.Placa = Console.ReadLine();
			Console.WriteLine("Qual a cor?");
			carro.Cor = Console.ReadLine();
			Console.WriteLine("Qual a kilometragem?");
			carro.Km = float.Parse(Console.ReadLine());
			Console.WriteLine("Quantos litros de combustível possui no momento?");
			carro.LitrosCombustivel = int.Parse(Console.ReadLine());
			Console.WriteLine("Qual o valor do seu carro?");
			carro.Preco = Double.Parse(Console.ReadLine());
			Console.WriteLine("O veículo está ligado? s/n");
			String valida = Console.ReadLine();
			if (valida.Equals("s"))
			{
				carro.IsLigado = true;
				Console.WriteLine("A que velocidade ele está andando no momento?");
				carro.Velocidade = int.Parse(Console.ReadLine());
			}
			else
			{
				Console.WriteLine("Você deseja ligar seu carro? s/n");
				String opcao = Console.ReadLine();
				if (opcao.Equals("s"))
				{
					carro.IsLigado = true;
				}
			}

			Console.WriteLine("\n\n\nO que você deseja fazer agora? ");
			Console.WriteLine("1 - Acelerar \n2 - Abastecer \n3- Frear \n4 - Mudar a cor \n5 - Ligar \n6 - Desligar");
			switch (int.Parse(Console.ReadLine()))
			{

				case 1:
					carro.acelerar();
					break;

				case 2:
					Console.WriteLine("Quantos litros você irá abastecer?");
					carro.abastecer(int.Parse(Console.ReadLine()));
					break;

				case 3:
					carro.frear();
					break;

				case 4:
					Console.WriteLine("Qual a cor que você deseja alterar?");
					String cor = Console.ReadLine();
					carro.pintar(cor);
					break;

				case 5:
					carro.ligar();
					break;

				case 6:
					carro.desligar();
					break;

			}
			Console.ReadKey();
		}
    }
}
