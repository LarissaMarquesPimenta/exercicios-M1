//Elabore um algoritmo em Java que leia 4 notas de um participante, em variáveis do tipo float e exiba na tela a média final do participante.

package exercicio02;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		
		Float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com a primeira nota: ");
		 nota1 = leia.nextFloat(); 
		 
		System.out.println("\nEntre com a segunda nota");
		nota2 = leia.nextFloat(); 
		
		System.out.println("\nDigite a terceira nota: ");
		nota3 = leia.nextFloat();
		
		System.out.println("\nDigite a quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\nA media é: %.2f", media);
		

	}

}
