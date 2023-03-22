// 
package Array;

import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
		int p = 0, i = 0, soma = 0, media = 0, x, y; 
		
		Scanner leia = new Scanner(System.in);
		
		for(x = 0; x < 10; x++) {
			System.out.println("Digite um número: ");
			vetor[x] = leia.nextInt();
			soma += vetor[x];
			}
		media += soma/10;
		System.out.println("\nOs números pares são: ");
		for(x = 0; x < 10; x++) {
			if (vetor[x] % 2 == 0) {				
				System.out.print(vetor[x] + " ");
			}}
		System.out.println("\nOs números nos indices impares são: ");
		for(x = 1; x < 10; x += 2) {							
				System.out.print(vetor[x] + " ");
			
	}

		System.out.println("\nA soma é: " + soma);
		System.out.println("\nA média é: " + media);

}}