//15/03

package exerciciosM1;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		int numero;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite um número: ");
		numero = leia.nextInt();
		
		if (numero > 0 && numero % 2 == 0 ) {
			System.out.println("O número é positivo e é par ");
		}
		else if (numero > 0 && numero % 2 == 1) {
			System.out.println("O número é positivo e é impar");
		}
		else if (numero < 0 && numero % 2 == 0) {
			System.out.println("O número é negativo e é par");
		}
		else if (numero < 0 && numero % 2 != 01 ) {
			System.out.println("O número é negativo e é impar ");
		}
		else {
			System.out.println("e o número é igual a zero");
		}
		
	}

}
