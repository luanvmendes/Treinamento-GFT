using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio01.com.gft.model
{
    class Veiculo
    {
		private String _marca;
		private String _modelo;
		private String _placa;
		private String _cor;
		private float _km;
		private bool _isLigado;
		private int _litrosCombustivel;
		private int _velocidade;
		private double _preco;

		public string Marca { get => _marca; set => _marca = value; }
		public string Modelo { get => _modelo; set => _modelo = value; }
		public string Placa { get => _placa; set => _placa = value; }
		public string Cor { get => _cor; set => _cor = value; }
		public float Km { get => _km; set => _km = value; }
		public bool IsLigado { get => _isLigado; set => _isLigado = value; }
		public int LitrosCombustivel { get => _litrosCombustivel; set => _litrosCombustivel = value; }
		public int Velocidade { get => _velocidade; set => _velocidade = value; }
		public double Preco { get => _preco; set => _preco = value; }

		public void acelerar()
		{
			//verificar se está ligado
			if (IsLigado == true)
			{
				Velocidade = Velocidade + 20;
				LitrosCombustivel = LitrosCombustivel - 1;
				Console.WriteLine("Velocidade após aceleração: " + Velocidade + " km/h" + "\nLitros de combustível após aceleração: " + LitrosCombustivel + " litros");
			}
			else
			{
				Console.WriteLine("Não é possível acelerar com o carro desligado");
			}
		}

		public void abastecer(int qtdLitros)
		{
			if (qtdLitros <= 100)
			{
				qtdLitros = LitrosCombustivel + qtdLitros;
				if (qtdLitros > 100)
				{
					LitrosCombustivel = 100;
				}
				else
				{
					LitrosCombustivel = qtdLitros;
				}
			}
			else
			{
				LitrosCombustivel = 100;
			}
			Console.WriteLine("Litros de combustível após abastecer: " + LitrosCombustivel + " litros");
		}

		public void frear()
		{
			if (IsLigado == true)
			{
				if (Velocidade > 0)
				{
					Console.WriteLine("Velocidade atual: " + Velocidade + " km/h");
					Velocidade = Velocidade - 10;
					Velocidade = Velocidade;
					Console.WriteLine("Freando... " + Velocidade + " km/h");
				}
				else
				{
					Console.WriteLine("Veículo já está parado");
				}
			}
			else
			{
				Console.WriteLine("Veículo está desligado.");
			}
		}

		public void pintar(String cor)
		{
			Cor = cor;
			Console.WriteLine("Cor do veículo: " + Cor);
		}

		public void ligar()
		{
			if (IsLigado != true)
			{
				IsLigado = true;
				Console.WriteLine("Carro ligado");
			}
			else
			{
				Console.WriteLine("Carro já está ligado!");
			}
		}

		public void desligar()
		{
			if (IsLigado == true)
			{
				IsLigado = false;
				Console.WriteLine("Carro desligado");
			}
			else
			{
				Console.WriteLine("Veículo já se encontra desligado");
			}
		}

	}
}
