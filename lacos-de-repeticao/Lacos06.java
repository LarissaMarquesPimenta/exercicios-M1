package exerciciosM1;

import java.util.Scanner;

public class Lacos06 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		String nome;
		float salario;
		double novoSalario;
		int codigo; 
		
		System.out.println("Digite o nome do(a) colaborador(a)");
		nome = leia.nextLine();
		
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Selecione o cargo: \t Percentual de ajuste: ");
		System.out.println("1. Gerente  \t\t\t10%");
		System.out.println("2. Vendedor  \t\t\t 7%");
		System.out.println("3. Supervisor  \t\t\t 9%");
		System.out.println("4. Motorista  \t\t\t 6%");
		System.out.println("5. Estoquista \t\t\t 5%");
		System.out.println("6. Tecnico de TI    \t\t 8%");
		codigo = leia.nextInt();
		
		switch(codigo) {
		
		case 1:
			novoSalario = salario + (salario*0.1);
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
		case 2:
			novoSalario = salario + (salario*0.07);
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
		case 3:
			novoSalario = salario + (salario*0.09);
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
		case 4:
			novoSalario = salario + (salario*0.06);
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
		case 5:
			novoSalario = salario + (salario* 0.05);
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
		case 6:
			novoSalario =  (salario + (salario * 0.08));
			System.out.printf("O salário de %s, será de %.2f", nome, novoSalario);
			break;
			
			
			
			
			
			
			
			
			
		} 
		

	}

}
