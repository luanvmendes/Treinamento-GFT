package main;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		
		carro.setLigado(false);
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
		
		carro.acelerar();

	}

}
