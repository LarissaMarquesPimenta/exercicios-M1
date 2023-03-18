package exercicio02;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
		Float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o valor do salario bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do adicional noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.println("Horas extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (5 * horasExtras) - descontos; 
		
		System.out.printf("O salário liquído é: %.2f", salarioLiquido);
				
	}

}
