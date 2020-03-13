using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio03.com.gft.model
{
    class Veiculo
    {
		private String _marca;
		private String _modelo;
		private bool _isLigado = true;
		private int _litrosCombustivel;
		private int _velocidade;
		private int _passageiros;

		public string Marca { get => _marca; set => _marca = value; }
		public string Modelo { get => _modelo; set => _modelo = value; }
		public bool IsLigado { get => _isLigado; set => _isLigado = value; }
		public int LitrosCombustivel { get => _litrosCombustivel; set => _litrosCombustivel = value; }
		public int Velocidade { get => _velocidade; set => _velocidade = value; }
		public int Passageiros { get => _passageiros; set => _passageiros = value; }

		public virtual void acelerar()
		{
			Console.WriteLine("Acelerando");
		}

		public virtual void abastecer(int qtdLitros)
		{
			Console.WriteLine("Veículo abastecido");
		}

		public virtual void desligar()
		{
			if (IsLigado == true)
			{
				IsLigado = false;
				Console.WriteLine("Veículo desligado");
			}
			else
			{
				Console.WriteLine("Veículo já se encontra desligado");
			}
		}
	}
}
