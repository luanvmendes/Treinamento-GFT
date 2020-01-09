package main;

import java.util.Scanner;

import model.Aviao;
import model.Caminhao;
import model.Carro;

public class Main {

	public static void main(String[] args) {		
		
		Scanner entrada = new Scanner(System.in);
		String marca, modelo, tipo, uso;
		int opcao, vel, passageiros, portas, ano, litros, altura;
		
		System.out.println("Qual tipo de ve�culo voc� utiliza? \n1 - Carro \n2 - Avi�o \n3 - Caminh�o");
		opcao = entrada.nextInt();
		switch (opcao) {
		
		case 1:			
			Carro car = new Carro();
			System.out.println("Qual a marca do carro?");
			marca = entrada.next();
			car.setMarca(marca);
			System.out.println("Qual o modelo do carro?");
			modelo = entrada.next();
			car.setModelo(modelo);
			System.out.println("Qual a velocidade que est� se locomovendo?");
			vel = entrada.nextInt();
			car.setVelocidade(vel);
			System.out.println("Quantos passageiros?");
			passageiros = entrada.nextInt();
			car.setPassageiros(passageiros);
			System.out.println("Quantas portas possui o carro?");
			portas = entrada.nextInt();
			car.setPortas(portas);
			System.out.println("Qual o ano do carro?");
			ano = entrada.nextInt();
			car.setAno(ano);
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			litros = entrada.nextInt();
			if (litros <= 100) {
				car.setLitrosCombustivel(litros);	
			} else {
				car.setLitrosCombustivel(100);
			}
			
			System.out.println("Modelo: " + car.getModelo() + " Marca: " + car.getMarca());
			System.out.println("Velocidade: " + car.getVelocidade() + " km/h" + " Passageiros: " + car.getPassageiros() + 
					"\nCombust�vel: " + car.getLitrosCombustivel() + " litros" + " Portas: " +car.getPortas() + "\nAno: " + car.getAno());
			
			System.out.println("\n\n\nO que voc� deseja fazer agora? ");
			System.out.println("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
			switch (entrada.nextInt()) {
			
			case 1:
				car.acelerar();
				break;
				
			case 2:
				System.out.println("Quantos litros voc� ir� abastecer?");
				car.abastecer(entrada.nextInt());
				break;
				
			case 3:
				car.desligar();
				break;
				
			}
			
			break;
			
		case 2:				
			Aviao av = new Aviao();		
			System.out.println("Qual o modelo do avi�o?");
			modelo = entrada.next();
			av.setModelo(modelo);
			System.out.println("Qual a velocidade que est� se locomovendo?");
			vel = entrada.nextInt();
			av.setVelocidade(vel);
			System.out.println("Quantos passageiros?");
			passageiros = entrada.nextInt();
			av.setPassageiros(passageiros);
			System.out.println("Qual tipo do avi�o?");
			tipo = entrada.next();
			av.setTipo(tipo);
			System.out.println("Qual a finalidade de uso?");
			uso = entrada.next();
			av.setUso(uso);
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			litros = entrada.nextInt();
			if (litros <= 4000) {
				av.setLitrosCombustivel(litros);	
			} else {
				av.setLitrosCombustivel(4000);
			}
			
			System.out.println("Modelo: " + av.getModelo() + " Velocidade: " + av.getVelocidade() + " km/h" +
					"\nPassageiros: " + av.getPassageiros() + " Tipo do avi�o: " + av.getTipo() +
					"\nFinalidade de uso: " + av.getUso() + "\nCombust�vel: " + av.getLitrosCombustivel() + " litros");
			
			System.out.println("\n\n\nO que voc� deseja fazer agora? ");
			System.out.println("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
			switch (entrada.nextInt()) {
			
			case 1:
				av.acelerar();
				break;
				
			case 2:
				System.out.println("Quantos litros voc� ir� abastecer?");
				av.abastecer(entrada.next());
				break;
				
			case 3:
				av.desligar();
				break;
				
			}
			break;
			
		case 3:			
			Caminhao c = new Caminhao();			
			System.out.println("Qual o modelo do caminh�o?");
			modelo = entrada.next();
			c.setModelo(modelo);
			System.out.println("Qual a velocidade que est� se locomovendo?");
			vel = entrada.nextInt();
			c.setVelocidade(vel);
			System.out.println("Quantos passageiros?");
			passageiros = entrada.nextInt();
			c.setPassageiros(passageiros);
			System.out.println("Qual a altura do caminh�o?");
			altura = entrada.nextInt();
			c.setAltura(altura);
			System.out.println("Qual a finalidade de uso?");
			uso = entrada.next();
			c.setUso(uso);
			System.out.println("Quantos litros de combust�vel possui no tanque?");
			litros = entrada.nextInt();
			if (litros <= 275) {
				c.setLitrosCombustivel(litros);	
			} else {
				c.setLitrosCombustivel(275);
			}
			
			System.out.println("Modelo: " + c.getModelo() + " Velocidade: " + c.getVelocidade() + " km/h" +
					"\nPassageiros: " + c.getPassageiros() + " Altura do caminh�o: " + c.getAltura() +
					"\nFinalidade de uso: " + c.getUso() + "\nCombust�vel: " + c.getLitrosCombustivel() + " litros");
			
			System.out.println("\n\n\nO que voc� deseja fazer agora? ");
			System.out.println("1 - Acelerar \n2 - Abastecer \n3 - Desligar");
			switch (entrada.nextInt()) {
			
			case 1:
				c.acelerar();
				break;
				
			case 2:
				System.out.println("Quantos litros voc� ir� abastecer?");
				c.abastecer(entrada.nextFloat());
				break;
				
			case 3:
				c.desligar();
				break;
				
			}
			break;	
			
		}
	}

}
