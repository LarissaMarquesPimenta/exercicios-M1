package exerciciosM1;

import java.util.Scanner;

public class DoarSangue {

	public static void main(String[] args) {
		
		String nome; 
		//15/03
		
		int idade; 
		boolean doacao; 
	
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o nome do doador: ");
		nome = leia.nextLine(); 
		
		System.out.println("\nDigite a idade do doador: "); 
		idade = leia.nextInt();
		
		System.out.println("\nJá Doou sangue antes? ");
		doacao = leia.nextBoolean();
		
		if (idade >=  18 && idade <= 59 ) {
			System.out.printf("%s, pode doar sangue!", nome);
		}
		else if (idade >= 60 && idade < 69 && doacao == true) 
			System.out.printf("%s, pode doar sangue.", nome); 
		else {
			System.out.printf("%s, não pode doar sangue.", nome);
		}
	}

}
