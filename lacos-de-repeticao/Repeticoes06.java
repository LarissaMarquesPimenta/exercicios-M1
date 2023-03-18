package exerciciosM1;

import java.util.Scanner;

public class Repeticoes06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, somaNum = 0, i = 0;
		float media; 
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero % 3 == 0 && numero != 0) {
				somaNum += numero;
				i ++; 
			}
		} 
		while (numero != 0);
		
		media = (somaNum/i);
		System.out.println("\nA média dos "+ i + "numeros é: "+ media);
		System.out.println(i);
		
	}

}
