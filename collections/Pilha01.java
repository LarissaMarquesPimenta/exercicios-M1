package collections;

import java.util.Scanner;
import java.util.Stack;

public class Pilha01 {

	public static void main(String[] args) {
		
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao;
		String livro; 
		boolean loop;
		
		while (true) {
			
			System.out.println("------------------------------------");
			System.out.println("    1. Adicionar livro na pilha     ");
			System.out.println("    2. Listar todos os livros       ");
			System.out.println("    3. Retirar livro da pilha       ");
			System.out.println("    0. Encerrar                     ");
			System.out.println("------------------------------------");
			System.out.println(" Escolha uma opção:   ");
			
			opcao = leia.nextInt();
			
			
			switch (opcao) {
			
			case 1: 
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				livro = leia.nextLine();
				pilha.add(livro);
				System.out.println("Livro adicionado na pilha!");
				
				continue; 
			
			case 2: 
				if (pilha.isEmpty() == true) {
					System.out.println("\nA pilha está vazia.");
				}
				else {
					System.out.println(pilha);
					
				}
				continue;
				
			case 3:
				if (pilha.isEmpty() == true) {
					System.out.println("\nA pilha está vazia.");
				}
				else {
					leia.nextLine();
					System.out.println("\nDigite o nome do livro: ");
					livro = leia.nextLine();
					pilha.remove(livro);
					System.out.println("Livro removido da pilha!"); 
					}	
				continue;
				
			case 0:
				System.out.println("Volte sempre!");
				loop = false; 
				break;
				

			}
						 

			
			
		}

	}

}
