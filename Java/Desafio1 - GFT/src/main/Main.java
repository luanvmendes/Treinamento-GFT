package main;
import java.util.Scanner;

import model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Qual a marca do seu carro?");
		carro.setMarca(input.nextLine());
		System.out.println("Qual o modelo?");
		carro.setModelo(input.nextLine());
		System.out.print("Insira a placa do seu veículo: ");
		carro.setPlaca(input.nextLine());
		System.out.println("Qual a cor?");
		carro.setCor(input.nextLine());
		System.out.println("Qual a kilometragem?");
		carro.setKm(input.nextFloat());
		System.out.println("Quantos litros de combustível possui no momento?");
		carro.setLitrosCombustivel(input.nextInt());
		System.out.println("Qual o valor do seu carro?");
		carro.setPreco(input.nextDouble());
		System.out.println("O veículo está ligado? s/n");
		String valida = input.next();
		if (valida.equals("s")) {
			carro.setLigado(true);
			System.out.println("A que velocidade ele está andando no momento?");
			carro.setVelocidade(input.nextInt());			
		}else{
			System.out.println("Você deseja ligar seu carro? s/n");
			String opcao = input.next();
			if (opcao.equals("s")) {
				carro.setLigado(true);
			}
		}
		
		System.out.println("\n\n\nO que você deseja fazer agora? ");
		System.out.println("1 - Acelerar \n2 - Abastecer \n3- Frear \n4 - Mudar a cor \n5 - Ligar \n6 - Desligar");
		switch (input.nextInt()) {
		
		case 1:
			carro.acelerar();
			break;
			
		case 2:
			System.out.println("Quantos litros você irá abastecer?");
			carro.abastecer(input.nextInt());
			break;
			
		case 3:
			carro.frear();
			break;
			
		case 4:
			System.out.println("Qual a cor que você deseja alterar?");
			String cor = input.next();
			carro.pintar(cor);
			break;
			
		case 5:
			carro.ligar();
			break;
			
		case 6:
			carro.desligar();
			break;
			
		}
				
		
		/*carro.setLigado(false);
		carro.setMarca("Fiat");
		carro.setCor("Preto");
		carro.setLitrosCombustivel(50);
		carro.setPlaca("ABC123");
		carro.setVelocidade(80);

		carro.frear();
		
		carro.setLigado(true);
		
		carro.acelerar();
		carro.abastecer(25);
		carro.frear();
		carro.pintar("vermelho");
		carro.ligar();
		carro.desligar();
		
		carro.acelerar();*/

	}

}
