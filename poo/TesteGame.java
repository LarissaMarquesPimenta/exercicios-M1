package poo;

import java.util.Scanner;

public class TesteGame {

	public static void main(String[] args) {
		
		Produto[] lista = new Produto[3]; 
		Scanner leia = new Scanner(System.in); 
		
		lista[0] = new Produto("Gris", "Jogo", "Nomada Studio", 2018, 32.99 );
		lista[1] = new Produto("Celeste", "Jogo", "Extremely OK Games", 2018, 36.99);
		lista[2] = new Produto("PS4", "Console", "Sony Entretainment", 2013, 2649.00);
			
		for(Produto loop:lista) {
			loop.visualizar();
		}
		System.out.println("\n-------------------------------------");
		
		for(Produto loop:lista) {
			System.out.println("\nDigite o valor do desconto: ");
			int desconto = leia.nextInt();
			loop.descontoProduto(desconto);
			}
	}

}
