using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio02.com.gft.model
{
    class Carro:Veiculo 
    {
        private String marca;
        private int portas;
        private int ano;

        public Carro(string modelo, int velocidade, int passageiros, int combustivel, string marca, int portas, int ano):base(modelo, velocidade, passageiros, combustivel)
        {
            this.marca = marca;
            this.portas = portas;
            this.ano = ano;
        }

        public string Marca { get => marca; set => marca = value; }
        public int Portas { get => portas; set => portas = value; }
        public int Ano { get => ano; set => ano = value; }
    }
}
