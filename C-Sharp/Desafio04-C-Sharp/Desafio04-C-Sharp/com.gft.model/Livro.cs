using System;
using System.Collections.Generic;
using System.Text;

namespace Desafio04_C_Sharp.com.gft.model
{
    class Livro:Produto,interfaces.Imposto
    {
        public string Autor { get; set; }
        public string Tema { get; set; }
        public int QtdPag { get; set; }

        public Livro(string nome, double preco, int qtd, string autor, string tema, int qtdPag) : base(nome, preco, qtd)
        {
            Autor = autor;
            Tema = tema;
            QtdPag = qtdPag;
        }

        public double calculaImposto()
        {
            double imposto = 0;
            if (Tema == "educativo")
            {
                Console.WriteLine("Livro educativo não tem imposto: " + Nome);
            }
            else
            {
                imposto = Preco * 0.1;
                Console.WriteLine("Impostos: R$ {0:0.00} sobre o livro {1}", imposto, Nome);
            }
            return imposto;
        }
    }
}
