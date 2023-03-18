package exerciciosM1;

import java.util.Scanner;

public class Lacos07 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double resultado; 
		float n1, n2;
		int codigo; 
		
		System.out.println("Digite um número: ");
		n1 = leia.nextFloat();
		System.out.println("Digite outro numero: ");
		n2 = leia.nextFloat(); 
		
		
		System.out.println("Codigo:\t Operação:");
		System.out.println("1. \t Soma");
		System.out.println("2. \t Subtração");
		System.out.println("3. \t Multiplicação");
		System.out.println("4. \t Divisão");
		
		System.out.println("Escolha uma operação: ");
		
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1: 
			resultado = n1 + n2;
			System.out.println("O resultado é: "+resultado);
			break;

		case 2: 
			resultado = n1 - n2;
			System.out.println("O resultado é: "+resultado);
			break;

		case 3: 
			resultado = n1 * n2;
			System.out.println("O resultado é: "+resultado);
			break;

		case 4: 
			resultado = n1 / n2;
			System.out.printf("O resultado é: %.2f", resultado);
			break;
			
		}
		
		
		
	}
	
	

}
