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
			System.out.println("Seu tanque só comporta 275 litros");
			setLitrosCombustivel(275);
		} else {
				setLitrosCombustivel(litros);
		}
		System.out.println("Litros de combustível após abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se está ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade() + 15);
			setLitrosCombustivel(getLitrosCombustivel() - 5);
			System.out.println("Velocidade após aceleração: " + getVelocidade() + " km/h" + "\nLitros de combustível após aceleração: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("Não é possível acelerar com o caminhão desligado");
		}
	}

}
