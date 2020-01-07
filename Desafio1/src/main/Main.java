package main;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {

		Veiculo carro = new Veiculo();
		
		carro.setLigado(true);
		carro.setMarca("Fiat");
		carro.setCor("Preto");
		carro.setLitrosCombustivel(20);
		carro.setPlaca("ABC123");
		carro.setVelocidade(100);

		carro.frear();
		carro.acelerar();
		carro.abastecer(25);
		carro.frear();
		carro.pintar("vermelho");
		carro.ligar();
		carro.desligar();
		carro.acelerar();

	}

}
