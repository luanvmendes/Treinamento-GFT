using System;
using System.Collections.Generic;
using System.Text;

namespace Teste02.com.gft.model
{
    class Vendedor : Funcionario
    {
        public override double bonificacao()
        {
            return Salario + 3000;
        }
    }
}
