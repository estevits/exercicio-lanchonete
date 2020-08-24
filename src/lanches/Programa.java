package lanches;

import java.util.Scanner;

public class Programa {
	static Scanner teclado = new Scanner(System.in);
	
	public static void subMenuSanduiche(Sanduiche sanduiche) {
		String ingrediente;
		String[] ingredientes = new String[10];
		int opcao;
		int i=0;
		
		System.out.println("Digite at� 10 ingredientes, digite 0 quando encerrar");			
		ingrediente = teclado.next();
		while (! ingrediente.equals("0")) {
			ingredientes[i]=ingrediente;
			i+=1;
			ingrediente = teclado.next();
		}
		sanduiche.setIngredientes(ingredientes);
		System.out.println("Ingredientes escolhidos!");
		System.out.println("Qual � a dist�ncia para entrega? Digite um numero inteiro:");
		System.out.println("Para buscar no local digite 0");
		opcao = teclado.nextInt();
		System.out.println("Pedido dispon�vel em "+ sanduiche.calculaTempo(opcao)+" minutos!");
		System.out.println("O valor � "+ sanduiche.getPreco()+" reais.");
		return;
	}
	
	public static void subMenuMassa(Massa massa) {
		String ingrediente;
		int opcao;
		
		System.out.println("Selecione o tipo de massa");
		System.out.println("[1] macarr�o [2] pizza [3] lasanha, digite outro n�mero para encerrar o programa");
		opcao = teclado.nextInt();
		if (opcao == 1) {
			massa.setTipo("macarr�o");
			System.out.println("O tipo de massa �: " + massa.getTipo());
			System.out.println("Digite o molho que voc� quer");
			ingrediente = teclado.next();
			massa.setMolho(ingrediente);
			System.out.println("Molho escolhido!");
			System.out.println("Qual � a dist�ncia para entrega? Digite um numero inteiro:");
			System.out.println("Para buscar no local digite 0");
			opcao = teclado.nextInt();
			System.out.println("Pedido dispon�vel em "+ massa.calculaTempo(opcao)+" minutos!");
			System.out.println("O valor � "+ massa.getPreco()+" reais.");
			return;
		} else if (opcao == 2) {
			massa.setTipo("pizza");
			System.out.println("O tipo de massa �: " + massa.getTipo());
			System.out.println("Digite o molho que voc� quer");
			ingrediente = teclado.next();
			massa.setMolho(ingrediente);
			System.out.println("Molho escolhido!");
			System.out.println("Qual � a dist�ncia para entrega? Digite um numero inteiro:");
			System.out.println("Para buscar no local digite 0");
			opcao = teclado.nextInt();
			System.out.println("Pedido dispon�vel em "+ massa.calculaTempo(opcao)+" minutos!");
			System.out.println("O valor � "+ massa.getPreco()+" reais.");
			return;
		} else if (opcao == 3) {
			massa.setTipo("lasanha");
			System.out.println("O tipo de massa �: " + massa.getTipo());				
			System.out.println("Digite o molho que voc� quer");
			ingrediente = teclado.next();
			massa.setMolho(ingrediente);
			System.out.println("Molho escolhido!");
			System.out.println("Qual � a dist�ncia para entrega? Digite um numero inteiro:");
			System.out.println("Para buscar no local digite 0");
			opcao = teclado.nextInt();
			System.out.println("Pedido dispon�vel em "+ massa.calculaTempo(opcao)+" minutos!");
			System.out.println("O valor � "+ massa.getPreco()+" reais.");
			return;
		} else {
			System.out.println("Op��o inv�lida, programa encerrado.");
			return;
		}
	}
	
	public static void subMenuBolo(Bolo bolo) {
		String ingrediente;
		int opcao;
		
		System.out.println("Digite a massa que voc� quer");
		ingrediente = teclado.next();
		bolo.setMassa(ingrediente);
		System.out.println("Massa escolhida!");
		System.out.println("Digite o recheio que voc� quer");
		ingrediente = teclado.next();
		bolo.setRecheio(ingrediente);
		System.out.println("Recheio escolhido!");
		System.out.println("Digite a cobertura que voc� quer");
		ingrediente = teclado.next();
		bolo.setCobertura(ingrediente);
		System.out.println("Cobertura escolhida!");
		System.out.println("Qual � a dist�ncia para entrega? Digite um numero inteiro:");
		System.out.println("Para buscar no local digite 0");
		opcao = teclado.nextInt();
		System.out.println("Pedido dispon�vel em "+ bolo.calculaTempo(opcao)+" minutos!");
		System.out.println("O valor � "+ bolo.getPreco()+" reais.");
		return;
	}
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao;
		
		System.out.println("Selecione o time de lanche");
		System.out.println("[1] sandu�ches [2] massas [3] bolos, digite outro n�mero para encerrar o programa");
		opcao = teclado.nextInt();
		
		if (opcao == 1) {
			lanche = (Sanduiche) new Sanduiche();
			subMenuSanduiche((Sanduiche) lanche);		
			
		} else if (opcao == 2) {
			lanche = (Massa) new Massa();
			subMenuMassa((Massa) lanche);

		} else if (opcao == 3) {
			lanche = (Bolo) new Bolo();
			subMenuBolo((Bolo) lanche);
	
		} else {
			System.out.println("Op��o inv�lida, programa encerrado.");
			return;
		}
	}
}
