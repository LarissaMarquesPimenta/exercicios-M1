package scr;

import java.util.Scanner;

public class Lacos05 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		int op, quantidade, total = 0;
		
		System.out.println(" Escolha seu lanche:");
		System.out.println(" 1. Cachorro quente \t R$10");
		System.out.println(" 2. X-Salada \t\t R$15");
		System.out.println(" 3. X-Bacon \t\t R$18");
		System.out.println(" 4. Bauru \t\t R$12");
		System.out.println(" 5. Refrigerante \t R$8");
		System.out.println(" 6. Suco de laranja \t R$13");
		op = leia.nextInt();
		
		System.out.println("Escolha a quantidade: ");
		quantidade = leia.nextInt();
		
		switch(op) {
		
		case 1: 
			total = quantidade * 10;
			System.out.println("O valor da conta é de R$ " + total);
			break; 
		
		case 2: 
			total = quantidade * 15;
			System.out.println("O valor da conta é de R$ " + total);
			break; 
		
		case 3: 
			total = quantidade * 18;
			System.out.println("O valor da conta é de R$ " + total);
			break;
			
		case 4: 
			total = quantidade * 12;
			System.out.println("O valor da conta é de R$ " + total);
			break; 		
		case 5: 
			total = quantidade * 8;
			System.out.println("O valor da conta é de R$ " + total);
			break;	
		case 6: 
			total = quantidade * 13;
			System.out.println("O valor da conta é de R$ " + total);
			break; 
			default: 
				System.out.println("Opção invalida!");

			
				
		
		
		}
		
	}

}
