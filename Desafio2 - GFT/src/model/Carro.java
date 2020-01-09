package model;


public class Carro extends Veiculo {
	
	private String marca;
	private int portas;
	private int ano;
			
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public Carro(String modelo, int velocidade, int passageiros, int combustivel, String marca, int portas, int ano) {
		super(modelo, velocidade, passageiros, combustivel);
		setMarca(marca);
		setPortas(portas);
		setAno(ano);
	}
	
}
