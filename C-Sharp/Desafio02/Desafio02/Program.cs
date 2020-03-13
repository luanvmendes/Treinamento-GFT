using System;

namespace Desafio02
{
    class Program
    {
        static void Main(string[] args)
        {
			String marca, modelo, tipo, uso;
			int opcao, vel, passageiros, portas, ano, litros;

			Console.WriteLine("Qual tipo de veículo você utiliza? \n1 - Carro \n2 - Avião");
			opcao = int.Parse(Console.ReadLine());
			switch (opcao)
			{

				case 1:
					Console.WriteLine("Qual a marca do carro?");
					marca = Console.ReadLine();
					Console.WriteLine("Qual o modelo do carro?");
					modelo = Console.ReadLine();
					Console.WriteLine("Qual a velocidade que está se locomovendo?");
					vel = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos passageiros?");
					passageiros = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantas portas possui o carro?");
					portas = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual o ano do carro?");
					ano = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos litros de combustível possui no tanque?");
					litros = int.Parse(Console.ReadLine());

					com.gft.model.Carro car = new com.gft.model.Carro(modelo, vel, passageiros, litros, marca, portas, ano);

					Console.WriteLine("Modelo: " + car.Modelo + " Marca: " + car.Marca);
					Console.WriteLine("Velocidade: " + car.Velocidade + " km/h" + " Passageiros: " + car.Passageiros +
							"\nCombustível: " + car.Combustivel + " litros" + " Portas: " + car.Portas + "\nAno: " + car.Ano);
					break;

				case 2:
					Console.WriteLine("Qual o modelo do avião?");
					modelo = Console.ReadLine();
					Console.WriteLine("Qual a velocidade que está se locomovendo?");
					vel = int.Parse(Console.ReadLine());
					Console.WriteLine("Quantos passageiros?");
					passageiros = int.Parse(Console.ReadLine());
					Console.WriteLine("Qual tipo do avião?");
					tipo = Console.ReadLine();
					Console.WriteLine("Qual a finalidade de uso?");
					uso = Console.ReadLine();
					Console.WriteLine("Quantos litros de combustível possui no tanque?");
					litros = int.Parse(Console.ReadLine());

					com.gft.model.Aviao av = new com.gft.model.Aviao(modelo, vel, passageiros, litros, tipo, uso);

					Console.WriteLine("Modelo: " + av.Modelo + " Velocidade: " + av.Velocidade + " km/h" +
							"\nPassageiros: " + av.Passageiros + " Tipo do avião: " + av.Tipo +
							"\nFinalidade de uso: " + av.Uso + "\nCombustível: " + av.Combustivel + " litros");
					break;
			}
			Console.ReadKey();
		}
    }
}
