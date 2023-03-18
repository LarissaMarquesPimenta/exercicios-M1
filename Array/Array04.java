/* 
 Ler uma matriz com notas de alunos, armazene as medias de cada um e exiba */

package exerciciosM1;

public class Array04 {

	public static void main(String[] args) {
		float media = 0, soma = 0;
		double[] mediasAlunos = new double[10];
		double[][] notas = {{4, 5, 7, 3},
						   {2.5, 6.5, 4.7, 8},
						   {10, 8.5, 9.5, 8},
						   {9, 6.5, 7.6, 8.2},
						   {5, 5, 5, 6.3},
						   {7, 8, 9, 8.5},
						   {5.5, 3.5, 2.5, 1},
						   {8, 9, 10, 9.5},
						   {5.6, 5.8, 7, 3},
						   {7.5, 8.5, 9.5, 10}};
		
	for (int i = 0; i < 10; i++) {
		media = 0; 
		soma = 0;
		System.out.println("\nAluno " + (i+1));
		for (int j = 0; j < 4; j++) {
			System.out.print(" " + notas[i][j]);
			soma += notas[i][j];
			media = (soma / 4);
			
		}
		mediasAlunos[i] = media;
		
	}	
	System.out.println();
	System.out.println("A média de cada aluno foi de: ");
	for(int a = 0; a < 10; a++) {
		System.out.printf("%.2f \t", mediasAlunos[a]);
}	}
}
