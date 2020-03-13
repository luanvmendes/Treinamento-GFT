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
			System.out.println("Seu tanque s� comporta 4000 litros");
			setLitrosCombustivel(4000);
		} else {
				setLitrosCombustivel(litros);
		}
		System.out.println("Litros de combust�vel ap�s abastecer: " + getLitrosCombustivel() + " litros");
	}
	
	@Override
	public void acelerar() {
		//verificar se est� ligado
		if (getLigado() == true) {
			setVelocidade(getVelocidade() + 500);
			setLitrosCombustivel(getLitrosCombustivel() - 80);
			System.out.println("Velocidade ap�s acelera��o: " + getVelocidade() + " km/h" + "\nLitros de combust�vel ap�s acelera��o: " + getLitrosCombustivel() + " litros");
		} else {
			System.out.println("N�o � poss�vel acelerar com o avi�o desligado");
		}
	}
	
}
