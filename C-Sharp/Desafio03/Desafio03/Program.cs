using System;

namespace Desafio03
{
    class Program
    {
        static void Main(string[] args)
        {
			int opcao;

			Console.WriteLine("Qual tipo de veículo você utiliza? \n1 - Carro \n2 - Avião \n3 - Caminhão");
			opcao = int.Parse(Console.ReadLine());
			switch (opcao)
			{

				case 1:
					com.gft.model.Carro car = new com.gft.model.Carro();
					Console.WriteLine("Qual a marca do carro?");
					car.Marca = Console.ReadLine();
					Console.WriteLine("Qual o modelo do carro?");
					car.Modelo = Console.ReadLine();
					Console.WriteLine("Qual a velocidade que está se locomovendo?");
					car.Velocidade = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos passageiros?");
					car.Passageiros = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantas portas possui o carro?");
					car.Portas = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual o ano do carro?");
					car.Ano = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos litros de combustível possui no tanque?");
					car.LitrosCombustivel = int.Parse(Console.ReadLine());
					if (car.LitrosCombustivel > 100)
					{
						car.LitrosCombustivel = 100;
					}

					Console.WriteLine("Modelo: " + car.Modelo + " Marca: " + car.Marca);
					Console.WriteLine("Velocidade: " + car.Velocidade + " km/h" + " Passageiros: " + car.Passageiros +
							"\nCombustível: " + car.LitrosCombustivel + " litros" + " Portas: " + car.Portas + "\nAno: " + car.Ano);

					Console.WriteLine("\n\n\nO que você deseja fazer agora? ");
					Console.WriteLine("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
					switch (int.Parse(Console.ReadLine()))
					{

						case 1:
							car.acelerar();
							break;

						case 2:
							Console.WriteLine("Quantos litros você irá abastecer?");
							car.abastecer(int.Parse(Console.ReadLine()));
							break;

						case 3:
							car.desligar();
							break;

					}

					break;

				case 2:
					com.gft.model.Aviao av = new com.gft.model.Aviao();	
					Console.WriteLine("Qual o modelo do avião?");
					av.Modelo = Console.ReadLine();
					Console.WriteLine("Qual a velocidade que está se locomovendo?");
					av.Velocidade = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos passageiros?");
					av.Passageiros = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual tipo do avião?");
					av.Tipo = Console.ReadLine();
					Console.WriteLine("Qual a finalidade de uso?");
					av.Uso = Console.ReadLine();
					Console.WriteLine("Quantos litros de combustível possui no tanque?");
					av.LitrosCombustivel = int.Parse(Console.ReadLine());
					if (av.LitrosCombustivel > 4000)
					{
						av.LitrosCombustivel = 4000;
					}

					Console.WriteLine("Modelo: " + av.Modelo + " Velocidade: " + av.Velocidade + " km/h" +
							"\nPassageiros: " + av.Passageiros + " Tipo do avião: " + av.Tipo +
							"\nFinalidade de uso: " + av.Uso + "\nCombustível: " + av.LitrosCombustivel + " litros");

					Console.WriteLine("\n\n\nO que você deseja fazer agora? ");
					Console.WriteLine("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
					switch (int.Parse(Console.ReadLine()))
					{

						case 1:
							av.acelerar();
							break;

						case 2:
							Console.WriteLine("Quantos litros você irá abastecer?");
							av.abastecer(int.Parse(Console.ReadLine()));
							break;

						case 3:
							av.desligar();
							break;

					}
					break;

				case 3:
					com.gft.model.Caminhao c = new com.gft.model.Caminhao();
					Console.WriteLine("Qual o modelo do caminhão?");
					c.Modelo = Console.ReadLine();
					Console.WriteLine("Qual a velocidade que está se locomovendo?");
					c.Velocidade = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos passageiros?");
					c.Passageiros = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual a altura do caminhão?");
					c.Altura = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual a finalidade de uso?");
					c.Uso = Console.ReadLine();
					Console.WriteLine("Quantos litros de combustível possui no tanque?");
					c.LitrosCombustivel = int.Parse(Console.ReadLine());
					if (c.LitrosCombustivel > 275)
					{
						c.LitrosCombustivel = 275;
					}

					Console.WriteLine("Modelo: " + c.Modelo + " Velocidade: " + c.Velocidade + " km/h" +
							"\nPassageiros: " + c.Passageiros + " Altura do caminhão: " + c.Altura +
							"\nFinalidade de uso: " + c.Uso + "\nCombustível: " + c.LitrosCombustivel + " litros");

					Console.WriteLine("\n\n\nO que você deseja fazer agora? ");
					Console.WriteLine("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
					switch (int.Parse(Console.ReadLine()))
					{

						case 1:
							c.acelerar();
							break;

						case 2:
							Console.WriteLine("Quantos litros você irá abastecer?");
							c.abastecer(float.Parse(Console.ReadLine()));
							break;

						case 3:
							c.desligar();
							break;

					}
					break;

			}
			Console.ReadKey();
		}
    }
}
