package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {

	private String marca, modelo;
	private boolean isUsado;
	
	public VideoGame() {
		super();
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
		setMarca(marca);
		setModelo(modelo);
		setUsado(isUsado);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean getUsado() {
		return isUsado;
	}
	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	
	@Override
	public double calculaImposto() {
		double imposto;
		if (getUsado() == true) {
			imposto = getPreco() * 0.25;
			System.out.printf("Imposto %s %s usado: R$ %.2f \n", getNome(), getModelo(), imposto);
		} else {
			imposto = getPreco() * 0.45;
			System.out.printf("Imposto %s %s: R$ %.2f", getNome(), getModelo(), imposto);
		}
		return imposto;
	}
	
	
	
}
