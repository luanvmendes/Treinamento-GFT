using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio03.com.gft.model
{
    class Carro:Veiculo
    {
        private int portas;
        private int ano;

        public int Portas { get => portas; set => portas = value; }
        public int Ano { get => ano; set => ano = value; }

		public override void abastecer(int qtd)
		{
			qtd = LitrosCombustivel + qtd;
			if (qtd > 100)
			{
				Console.WriteLine("Seu tanque só comporta 100 litros");
				LitrosCombustivel = 100;
			}
			else
			{
				LitrosCombustivel = qtd;
			}
			Console.WriteLine("Litros de combustível após abastecer: " + LitrosCombustivel + " litros");
		}

		public override void acelerar()
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
	}
}
