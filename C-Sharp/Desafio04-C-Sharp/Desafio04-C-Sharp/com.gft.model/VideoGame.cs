using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio04_C_Sharp.com.gft.model
{
    class VideoGame:Produto
    {
        public string Marca { get; set; }
        public string Modelo { get; set; }
        public bool IsUsado { get; set; }

        public VideoGame() { }

        public VideoGame(string nome, double preco, int qtd, string marca, string modelo, bool isUsado):base(nome, preco, qtd)
        {
            Marca = marca;
            Modelo = modelo;
            IsUsado = isUsado;
        }

        public double calculaImposto()
        {
            double imposto;
            if (IsUsado == true)
            {
                imposto = Preco * 0.25;
                Console.WriteLine("Imposto {0} {1} usado: R$ {2:0.00}", Nome, Modelo, imposto);
            }
            else
            {
                imposto = Preco * 0.45;
                Console.WriteLine("Imposto {0} {1}: R$ {2:0.00}", Nome, Modelo, imposto);
            }
            return imposto;
        }
    }
}
