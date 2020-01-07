package model;

public class Veiculo {
	
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean isLigado;
	private int litrosCombustivel;
	private int Velocidade;
	private double Preco;
	
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
	public String getPlaca() {
		return Placa;
	}
	public void setPlaca(String placa) {
		Placa = placa;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public float getKm() {
		return Km;
	}
	public void setKm(float km) {
		Km = km;
	}
	public boolean isLigado() {
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
	public double getPreco() {
		return Preco;
	}
	public void setPreco(double preco) {
		Preco = preco;
	}
	
	public void acelerar() {
		//verificar se está ligado
		if (isLigado == true) {
			setVelocidade(getVelocidade()+20);
			litrosCombustivel = getLitrosCombustivel() - 1;
			setLitrosCombustivel(litrosCombustivel);
			System.out.println("Velocidade após aceleração: "+getVelocidade() + " km/h" + "\nLitros de combustível após aceleração: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("Não é possível acelerar com o carro desligado");
		}
	}
	
	public void abastecer(int qtdLitros) {
		if (qtdLitros <= 100) {
			qtdLitros = getLitrosCombustivel() + qtdLitros;
			if (qtdLitros>100) {
				setLitrosCombustivel(100);
			}else {
				setLitrosCombustivel(qtdLitros);
			}
		} else {
			setLitrosCombustivel(100);
		}
		System.out.println("Litros de combustível após abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	public void frear() {
		if (isLigado == true) {
			if (getVelocidade() > 0 ) {
				System.out.println("Velocidade atual: "+ getVelocidade() + " km/h");
				Velocidade = getVelocidade() - 10;
				setVelocidade(Velocidade);
				System.out.println("Freando... "+ getVelocidade() + " km/h");
			} else {
				System.out.println("Veículo já está parado");
			}
		} else {
			System.out.println("Veículo está desligado.");
		}
	}
	
	public void pintar(String cor) {
		setCor(cor);
		System.out.println("Cor do veículo: " + getCor());
	}
	
	public void ligar() {
		if (isLigado != true) {
			isLigado = true;
			System.out.println("Carro ligado");
		}else {
			System.out.println("Carro já está ligado!");
		}
	}
	
	public void desligar() {
		if (isLigado == true) {
			isLigado = false;
			System.out.println("Carro desligado");
		} else {
			System.out.println("Veículo já se encontra desligado");
		}
	}
		
}
