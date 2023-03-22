package scr;

import java.util.Scanner;

public class Repeticao03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, anos21= 0, anos50 = 0; 
		
		System.out.println("Digite a idade: ");
		idade = leia.nextInt(); 
		
		while (idade > 0) {
			if (idade > 50) {
				anos50 +=1;
			}
			else if (idade < 21) {
				anos21 += 1;
			}		
			
		System.out.println("\nDigite a idade: ");	
		idade = leia.nextInt();
		}
		
		System.out.println("pessoas com mais de 50: "+ anos50);
		System.out.println("pessoas com menor de 21: " + anos21);
	}

}
