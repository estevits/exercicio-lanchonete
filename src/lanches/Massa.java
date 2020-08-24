package lanches;

public class Massa extends Lanche {
	private String tipo;
	private String molho;
	
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + 30;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}	
	
	public double getPreco() {
		super.setPreco(34.99);
		return super.getPreco();
	}
}
