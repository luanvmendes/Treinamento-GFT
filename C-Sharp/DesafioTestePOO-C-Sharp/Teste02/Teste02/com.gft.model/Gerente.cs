using System;
using System.Collections.Generic;
using System.Text;

namespace Teste02.com.gft.model
{
    class Gerente : Funcionario
    {
        public override double bonificacao()
        {
            return Salario + 10000;
        }
    }
}
