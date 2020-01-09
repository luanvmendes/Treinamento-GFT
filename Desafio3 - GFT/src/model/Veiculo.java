package model;

public class Veiculo {

	private String Marca;
	private String Modelo;
	private boolean isLigado = true;
	private int litrosCombustivel;
	private int Velocidade;
	private int passageiros;
	
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public boolean getLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void abastecer(int qtdLitros) {
		System.out.println("Veículo abastecido");
	}
		
	public void desligar() {
		if (getLigado() == true) {
			setLigado(false);
			System.out.println("Veículo desligado");
		} else {
			System.out.println("Veículo já se encontra desligado");
		}
	}
	
}
