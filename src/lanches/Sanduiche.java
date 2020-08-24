package lanches;

public class Sanduiche extends Lanche{
	private String[] ingredientes =	new String[10];	
	
	public String[] getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String[] ingredientes) {
		this.ingredientes = ingredientes;
	}
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + 15;
	}
	public double getPreco() {
		super.setPreco(21.99);
		return super.getPreco();
	}
}
