package model;

public class Aviao extends Veiculo {

	private String tipo;
	private String uso;
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUso() {
		return uso;
	}
	public void setUso(String uso) {
		this.uso = uso;
	}
	
	public void abastecer(String qtd) {
		int litros = Integer.parseInt(qtd);
		litros = getLitrosCombustivel() + litros;
		if (litros > 4000) {
			System.out.println("Seu tanque só comporta 4000 litros");
			setLitrosCombustivel(4000);
		} else {
				setLitrosCombustivel(litros);
		}
		System.out.println("Litros de combustível após abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se está ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade() + 500);
			setLitrosCombustivel(getLitrosCombustivel() - 80);
			System.out.println("Velocidade após aceleração: " + getVelocidade() + " km/h" + "\nLitros de combustível após aceleração: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("Não é possível acelerar com o avião desligado");
		}
	}
	
}
