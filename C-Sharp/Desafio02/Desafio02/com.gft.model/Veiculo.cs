using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio02.com.gft.model
{
    class Veiculo
    {
        private String modelo;
        private int velocidade;
        private int passageiros;
        private int combustivel;

        public Veiculo(string modelo, int velocidade, int passageiros, int combustivel)
        {
            this.modelo = modelo;
            this.velocidade = velocidade;
            this.passageiros = passageiros;
            this.combustivel = combustivel;
        }

        public Veiculo() { }

        public string Modelo { get => modelo; set => modelo = value; }
        public int Velocidade { get => velocidade; set => velocidade = value; }
        public int Passageiros { get => passageiros; set => passageiros = value; }
        public int Combustivel { get => combustivel; set => combustivel = value; }


    }
}
