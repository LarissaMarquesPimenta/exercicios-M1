package exerciciosM1;

import java.util.Scanner;

public class Repeticao02 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, par = 0, impar = 0; 
		
		for (int x = 1; x <= 10; x++) {
			System.out.printf("Digite o %d° número: ", x);
			numero = leia.nextInt();
			if (numero % 2 == 0) {
				par +=1;
			}
			else {
				impar +=1;
			}
			
		}
		System.out.printf("Entre os numeros digitados, %d são pares e %d são impares. ", par, impar); 	

	}

}
