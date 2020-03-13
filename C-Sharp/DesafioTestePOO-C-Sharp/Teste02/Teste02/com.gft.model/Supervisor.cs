using System;
using System.Collections.Generic;
using System.Text;

namespace Teste02.com.gft.model
{
    class Supervisor : Funcionario
    {
        public override double bonificacao()
        {
            return Salario + 5000;
        }
    }
}
