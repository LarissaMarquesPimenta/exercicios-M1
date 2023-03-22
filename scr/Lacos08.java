package scr;

import java.util.Scanner;

public class Lacos08 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int operacao; 
		float saldo = 1000;
		double novoSaldo, saque, deposito; 
		
		
		
		System.out.println("Codigo:\t Operação:");
		System.out.println("1. \t Saldo");
		System.out.println("2. \t Saque");
		System.out.println("3. \t Deposito");
		
System.out.println("Escolha uma operação: ");
		
		operacao = leia.nextInt();
		
		switch(operacao) {
		
		case 1: 
			novoSaldo = saldo;
			System.out.println("O resultado é: "+novoSaldo);
			break;

		case 2: 
			System.out.println("Valor do saque: ");
			saque = leia.nextDouble();
			novoSaldo = saldo - saque;
			System.out.println("O novo saque é de: "+novoSaldo);
			break; 

		case 3: 
			System.out.println("Valor do deposito: ");
			deposito = leia.nextDouble();
			novoSaldo = saldo + deposito;
			System.out.println("O novo saldo é de: "+novoSaldo);
			break;

		}		
		
	}

}
