package model;

public class Caminhao extends Veiculo {
	
	private int altura;
	private String uso;
	
	public int getAltura() {
		return altura;
	}
	public void setAltura(int altura) {
		this.altura = altura;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void abastecer(float qtd) {
		int litros = (int) qtd;
		litros = getLitrosCombustivel() + litros;
		if (litros > 275) {
			System.out.println("Seu tanque s� comporta 275 litros");
			setLitrosCombustivel(275);
		} else {
				setLitrosCombustivel(litros);
		}
		System.out.println("Litros de combust�vel ap�s abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se est� ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade() + 15);
			setLitrosCombustivel(getLitrosCombustivel() - 5);
			System.out.println("Velocidade ap�s acelera��o: " + getVelocidade() + " km/h" + "\nLitros de combust�vel ap�s acelera��o: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("N�o � poss�vel acelerar com o caminh�o desligado");
		}
	}

}
