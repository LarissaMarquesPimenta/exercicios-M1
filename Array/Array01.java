package Array;

import java.util.Scanner;

public class Array01 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in); 
		
		
		int[] num = new int[10];
		int numero, encontrado, x, cont = 0; 
		
		
		for (x = 0; x < 10; x++) {
			System.out.println("\nEntre com um numero do array: ");
			num[x] = leia.nextInt(); 
		}
		System.out.println("\nDigite um número para procurar: ");
		numero = leia.nextInt();
		
		for (x = 0; x < 10; x++) {
			if(num[x] == numero) {
				System.out.println("\nA posição do numero é: " + (x+1));
				cont++;
			}
		}
		if (cont == 0) {
			System.out.println("\nNão encontrado.");
		}
			
			
	
			
		}
	}
