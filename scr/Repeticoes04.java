package scr;

import java.util.Scanner;

public class Repeticoes04 {

	public static void main(String[] args) {
		
		int idade, genero, categoria, a = 0, b = 0, c = 0, d = 0;
		boolean status = true;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		while(status == true) {
			
			System.out.println("Digite a idade: ");
			idade = leia.nextInt(); 
			
			System.out.println("Escolha o genero: ");
			System.out.println("1. Masculino");
			System.out.println("2. Feminino");
			System.out.println("3. Outros");
			genero = leia.nextInt();
			
			System.out.println("Digite a categoria: ");
			System.out.println("1. Backend");
			System.out.println("2. Frontend");
			System.out.println("3. Mobile");
			System.out.println("4. FullStack");
			categoria = leia.nextInt();
			
			if (categoria == 1) {
				a += 1; 
			}
			else if (genero == 2 && categoria == 3) { 
				b += 1;
			}
			else if(genero == 1 && categoria == 3 && idade > 40) {
				c += 1;
			}
			else if (genero == 2 && categoria == 4 && idade < 30) {
				d += 1; 
			}
			System.out.println("Deseja adicionar outro colaboradore? (true or false)");
			status = leia.nextBoolean();
			
		}
		System.out.println("\nO número de pessoas desenvolvedoras de backend é: " + a);
		System.out.println("\nO número de mulheres desenvolvedoras de frontend é: " + b);
		System.out.println("\nO número de desenvolvedores mobile maiores de 40 anos é: " + c);
		System.out.println("\nO número de mulheres desenvolvedoras fullstack menores de 30 anos é: " + d);
		
	}

}
