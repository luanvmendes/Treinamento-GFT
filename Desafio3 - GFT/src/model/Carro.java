package model;

public class Carro extends Veiculo {
	
	private int portas;
	private int ano;
	
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

	@Override
	public void abastecer(int qtd) {
		qtd = getLitrosCombustivel() + qtd;
		if (qtd > 100) {
			System.out.println("Seu tanque s� comporta 100 litros");
			setLitrosCombustivel(100);
		} else {
				setLitrosCombustivel(qtd);
		}
		System.out.println("Litros de combust�vel ap�s abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se est� ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade()+20);
			setLitrosCombustivel(getLitrosCombustivel() - 1);
			System.out.println("Velocidade ap�s acelera��o: " + getVelocidade() + " km/h" + "\nLitros de combust�vel ap�s acelera��o: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("N�o � poss�vel acelerar com o carro desligado");
		}
	}
	
}
