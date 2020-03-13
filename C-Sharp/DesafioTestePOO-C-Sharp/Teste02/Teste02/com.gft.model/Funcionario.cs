using System;
using System.Collections.Generic;
using System.Text;

namespace Teste02.com.gft.model
{
    class Funcionario
    {
        public String Nome { get; set; }
        public int Idade { get; set; }
        public double Salario { get; set; }

        public virtual double bonificacao()
        {
            return Salario;
        }

    }
}
