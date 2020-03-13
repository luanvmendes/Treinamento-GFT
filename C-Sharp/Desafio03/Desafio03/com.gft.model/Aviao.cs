using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio03.com.gft.model
{
    class Aviao:Veiculo
    {
        private String _tipo;
        private String _uso;

        public string Tipo { get => _tipo; set => _tipo = value; }
        public string Uso { get => _uso; set => _uso = value; }

		public void abastecer(String qtd)
		{
			int litros = int.Parse(qtd);
			litros = LitrosCombustivel + litros;
			if (litros > 4000)
			{
				Console.WriteLine("Seu tanque só comporta 4000 litros");
				LitrosCombustivel = 4000;
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
				Velocidade = Velocidade + 500;
				LitrosCombustivel = LitrosCombustivel - 80;
				Console.WriteLine("Velocidade após aceleração: " + Velocidade + " km/h" + "\nLitros de combustível após aceleração: " + LitrosCombustivel + " litros");
			}
			else
			{
				Console.WriteLine("Não é possível acelerar com o avião desligado");
			}
		}
	}
}
