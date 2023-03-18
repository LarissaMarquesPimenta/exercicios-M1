//Elaborar um programa de acordo com o Fluxograma do exercicio 01 

package exercicio02;

import java.util.Scanner;

public class Fluxograma {
    public static void main(String[] args) {
    	Float salario, abono, total;
    	
        Scanner leia = new Scanner(System.in);
        
        System.out.print("Digite o salário: ");
        salario = leia.nextFloat();
        
        System.out.print("Digite o valor do abono: ");
        abono = leia.nextFloat();
        
        total = salario + abono;
        
        System.out.printf("Novo salário: R$ %.2f", total);
        
        leia.close();
    }
}
