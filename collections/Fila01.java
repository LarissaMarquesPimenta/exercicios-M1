package collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila01 {

	public static void main(String[] args) {
		
		//declarar a fila 
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao; 
		String nome; 
		boolean loop = true; 
	
		// menu
		while (loop == true) {
		
			System.out.println("------------------------------------");
			System.out.println("    1. Adicionar cliente na fila    ");
			System.out.println("    2. Listar todos os clientes     ");
			System.out.println("    3. Retirar cliente da fila      ");
			System.out.println("    0. Encerrar                     ");
			System.out.println("------------------------------------");
			System.out.println(" Escolha uma opção:   ");
			
			opcao = leia.nextInt();
			
			switch (opcao) {
			
			case 1: 
				leia.nextLine();
				System.out.println("\nDigite o nome do cliente: ");
				nome = leia.nextLine();
				fila.add(nome);
				System.out.println("Cliente adicionado na fila!");
				
				continue; 
			
			case 2: 
				if (fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia.");
				}
				else {
					System.out.println(fila);
					
				}
				continue;
				
			case 3:
				if (fila.isEmpty() == true) {
					System.out.println("\nA fila está vazia.");
				}
				else {
					leia.nextLine();
					System.out.println("\nDigite o nome do cliente: ");
					nome = leia.nextLine();
					fila.remove(nome);
					System.out.println("Cliente removido da fila!"); 
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

	