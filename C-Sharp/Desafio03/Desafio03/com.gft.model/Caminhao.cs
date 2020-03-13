using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio03.com.gft.model
{
    class Caminhao:Veiculo
    {
        private int _altura;
        private String _uso;

        public int Altura { get => _altura; set => _altura = value; }
        public string Uso { get => _uso; set => _uso = value; }

		public void abastecer(float qtd)
		{
			int litros = (int)qtd;
			litros = LitrosCombustivel + litros;
			if (litros > 275)
			{
				Console.WriteLine("Seu tanque só comporta 275 litros");
				LitrosCombustivel = 275;
			}
			else
			{
				LitrosCombustivel = litros;
			}
			Console.WriteLine("Litros de combustível após abastecer: " + LitrosCombustivel + " litros");
		}

		public override void acelerar()
		{
			//verificar se está ligado
			if (IsLigado == true)
			{
				Velocidade = Velocidade + 15;
				LitrosCombustivel = LitrosCombustivel - 5;
				Console.WriteLine("Velocidade após aceleração: " + Velocidade + " km/h" + "\nLitros de combustível após aceleração: " + LitrosCombustivel + " litros");
			}
			else
			{
				Console.WriteLine("Não é possível acelerar com o caminhão desligado");
			}
		}
	}
}
