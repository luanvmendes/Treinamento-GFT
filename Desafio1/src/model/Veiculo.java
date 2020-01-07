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
		//verificar se est� ligado
		if (isLigado == true) {
			setVelocidade(getVelocidade()+20);
			litrosCombustivel = getLitrosCombustivel() - 1;
			setLitrosCombustivel(litrosCombustivel);
			System.out.println("Velocidade ap�s acelera��o: "+getVelocidade() + " km/h" + "\nLitros de combust�vel ap�s acelera��o: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("N�o � poss�vel acelerar com o carro desligado");
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
		System.out.println("Litros de combust�vel ap�s abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	public void frear() {
		if (isLigado == true) {
			if (getVelocidade() > 0 ) {
				System.out.println("Velocidade atual: "+ getVelocidade() + " km/h");
				Velocidade = getVelocidade() - 10;
				setVelocidade(Velocidade);
				System.out.println("Freando... "+ getVelocidade() + " km/h");
			} else {
				System.out.println("Ve�culo j� est� parado");
			}
		} else {
			System.out.println("Ve�culo est� desligado.");
		}
	}
	
	public void pintar(String cor) {
		setCor(cor);
		System.out.println("Cor do ve�culo: " + getCor());
	}
	
	public void ligar() {
		if (isLigado != true) {
			isLigado = true;
			System.out.println("Carro ligado");
		}else {
			System.out.println("Carro j� est� ligado!");
		}
	}
	
	public void desligar() {
		if (isLigado == true) {
			isLigado = false;
			System.out.println("Carro desligado");
		} else {
			System.out.println("Ve�culo j� se encontra desligado");
		}
	}
		
}
