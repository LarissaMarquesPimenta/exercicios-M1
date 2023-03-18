package exercicio02;

import java.util.Scanner;

public class diferencaProduto {

	public static void main(String[] args) {
		
	Float n1, n2, n3, n4, resultado;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		 n1 = leia.nextFloat(); 
		 
		System.out.println("\nEntre com a segunda nota");
		n2 = leia.nextFloat(); 
		
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		n4 = leia.nextFloat();
		
		resultado = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nO resultado é: %.2f", resultado);
		
		

	}

}
