package main;

import java.util.Scanner;

import model.Aviao;
import model.Carro;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		String marca, modelo, tipo, uso;
		int opcao, vel, passageiros, portas, ano, litros;
		
		System.out.println("Qual tipo de ve�culo voc� utiliza? \n1 - Carro \n2 - Avi�o");
		opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:
			System.out.println("Qual a marca do carro?");
			marca = entrada.next();
			System.out.println("Qual o modelo do carro?");
			modelo = entrada.next();
			System.out.println("Qual a velocidade que est� se locomovendo?");
			vel = entrada.nextInt();
			System.out.println("Quantos passageiros?");
			passageiros = entrada.nextInt();
			System.out.println("Quantas portas possui o carro?");
			portas = entrada.nextInt();
			System.out.println("Qual o ano do carro?");
			ano = entrada.nextInt();
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			litros = entrada.nextInt();
			
			Carro car = new Carro(modelo, vel, passageiros, litros, marca, portas, ano);
			
			System.out.println("Modelo: " + car.getModelo() + " Marca: " + car.getMarca());
			System.out.println("Velocidade: " + car.getVelocidade() + " km/h" + " Passageiros: " + car.getPassageiros() + 
					"\nCombust�vel: " + car.getCombustivel() + " litros" + " Portas: " +car.getPortas() + "\nAno: " + car.getAno());
			break;
			
		case 2:			
			System.out.println("Qual o modelo do avi�o?");
			modelo = entrada.next();
			System.out.println("Qual a velocidade que est� se locomovendo?");
			vel = entrada.nextInt();
			System.out.println("Quantos passageiros?");
			passageiros = entrada.nextInt();
			System.out.println("Qual tipo do avi�o?");
			tipo = entrada.next();
			System.out.println("Qual a finalidade de uso?");
			uso = entrada.next();
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			litros = entrada.nextInt();
			
			Aviao av = new Aviao(modelo, vel, passageiros, litros, tipo, uso);
			
			System.out.println("Modelo: " + av.getModelo() + " Velocidade: " + av.getVelocidade() + " km/h" +
					"\nPassageiros: " + av.getPassageiros() + " Tipo do avi�o: " + av.getTipo() +
					"\nFinalidade de uso: " + av.getUso() + "\nCombust�vel: " + av.getCombustivel() + " litros");
			break;			
		}
		
	}

}
