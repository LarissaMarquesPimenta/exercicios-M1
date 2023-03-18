package exerciciosM1;

import java.util.Scanner;
//15/03


public class CompararValores {

	public static void main(String[] args) {
		
		int a, b, c; 
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite o valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite o valor de c: ");
		c = leia.nextInt();
		
		if (a == b && b == c ) {
			System.out.println("Os valores são iguais"); 
		}
		else if (a > b && a > c) {
			System.out.println("O maior valor é o a. ");
		}
		else if (b > a && b > c) {
			System.out.println("O maior valor é o b. ");
		}
		else if (c > a && c > b) {
			System.out.println("O maior valor é o c. ");
		}
		else {
			System.out.println("Erro");
		}
		
	}

}
