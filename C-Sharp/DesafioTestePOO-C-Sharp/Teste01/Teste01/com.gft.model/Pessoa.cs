﻿using System;
using System.Collections.Generic;
using System.Text;

namespace Teste01.com.gft.model
{
    class Pessoa
    {
        public String Nome { get; set; }
        public int Idade { get; set; }

        public Pessoa()
        {
        }

		public Pessoa(string nome, int idade)
		{
			Nome = nome;
			Idade = idade;
		}

	}
}
