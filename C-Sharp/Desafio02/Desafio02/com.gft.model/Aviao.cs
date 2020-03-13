using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio02.com.gft.model
{
    class Aviao:Veiculo
    {
        private String tipo;
        private String uso;

        public Aviao(string modelo, int velocidade, int passageiros, int combustivel, string tipo, string uso):base(modelo, velocidade, passageiros, combustivel)
        {
            this.tipo = tipo;
            this.uso = uso;
        }

        public string Tipo { get => tipo; set => tipo = value; }
        public string Uso { get => uso; set => uso = value; }
    }
}
