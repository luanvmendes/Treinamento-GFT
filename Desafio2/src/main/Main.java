package main;

import java.util.Scanner;

import model.Aviao;
import model.Carro;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int opcao;
		
		System.out.println("Qual tipo de ve�culo voc� utiliza? \n1 - Carro \n2 - Avi�o");
		opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:
			Carro car = new Carro();
			System.out.println("Qual a marca do carro?");
			car.setMarca(entrada.next());
			System.out.println("Qual o modelo do carro?");
			car.setModelo(entrada.next());
			System.out.println("Qual a velocidade que est� se locomovendo?");
			car.setVelocidade(entrada.nextInt());
			System.out.println("Quantos passageiros?");
			car.setPassageiros(entrada.nextInt());
			System.out.println("Quantas portas possui o carro?");
			car.setPortas(entrada.nextInt());
			System.out.println("Qual o ano do carro?");
			car.setAno(entrada.nextInt());
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			car.setCombustivel(entrada.nextInt());
			
			System.out.println("Modelo: " + car.getModelo() + " Marca: " + car.getMarca());
			System.out.println("Velocidade: " + car.getVelocidade() + " km/h" + " Passageiros: " + car.getPassageiros() + 
					"\nCombust�vel: " + car.getCombustivel() + " litros" + " Portas: " +car.getPortas() + "\nAno: " + car.getAno());
			break;
			
		case 2:
			Aviao av = new Aviao();
			System.out.println("Qual o modelo do avi�o?");
			av.setModelo(entrada.next());
			System.out.println("Qual a velocidade que est� se locomovendo?");
			av.setVelocidade(entrada.nextInt());
			System.out.println("Quantos passageiros?");
			av.setPassageiros(entrada.nextInt());
			System.out.println("Qual tipo do avi�o?");
			av.setTipo(entrada.next());
			System.out.println("Qual a finalidade de uso?");
			av.setUso(entrada.next());
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			av.setCombustivel(entrada.nextInt());
			
			System.out.println("Modelo: " + av.getModelo() + " Velocidade: " + av.getVelocidade() + " km/h" +
					"\nPassageiros: " + av.getPassageiros() + " Tipo do avi�o: " + av.getTipo() +
					"\nFinalidade de uso: " + av.getUso() + "\nCombust�vel: " + av.getCombustivel() + " litros");
			break;			
		}
		
		

	}

}
