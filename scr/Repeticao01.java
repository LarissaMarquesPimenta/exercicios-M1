package scr;

import java.util.Scanner;

public class Repeticao01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int inferior, superior, x;
		boolean intervalo; 
		
		while(intervalo = true) {
		
		System.out.println("Defina o inicio do intervalo: ");
		inferior = leia.nextInt();
		
		System.out.println("Defina o final do intervalo: ");
		superior = leia.nextInt();		
		
		if (superior < inferior) {
			System.out.println("Intervalo invalido, tente novamente");
			intervalo = false; 			
		}
		for (x = inferior; x <= superior+1; x ++) {
			
			if (x % 3 == 0 && x % 5 == 0 && x != 0) {
				System.out.println(x + " é multiplo de 3 e 5.");
				
				}		
			}
		}
	}

}
