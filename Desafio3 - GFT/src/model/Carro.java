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
			System.out.println("Seu tanque só comporta 100 litros");
			setLitrosCombustivel(100);
		} else {
				setLitrosCombustivel(qtd);
		}
		System.out.println("Litros de combustível após abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se está ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade()+20);
			setLitrosCombustivel(getLitrosCombustivel() - 1);
			System.out.println("Velocidade após aceleração: " + getVelocidade() + " km/h" + "\nLitros de combustível após aceleração: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("Não é possível acelerar com o carro desligado");
		}
	}
	
}
