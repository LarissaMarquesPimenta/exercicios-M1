/*
Elaborar um algoritmo que leia uma matriz 3x3 de inteiros e mostre:
- todos os elementos da diagonal principal
- todos os elementos da diagonal secundária 
- a soma dos elementos da diagonal principal 
- a soma de todos os elementos da diagonal secundária
 
 */

package Array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int[] diagonalP = new int[3];
		int elemento, somaPrincipal = 0, somaSecundaria = 0, diagonalPrincipal, diagonalSecundaria; 
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.println("Digite os elementos da matriz: ");
				elemento = leia.nextInt();
				matriz[i][j] = elemento; 
				if (i == j) {
					somaPrincipal += elemento; 
					diagonalP[i] = matriz[i][j];				
				}
			}
		}
		
		System.out.println("Os elementos da diagonal principal são: ");
		for(int a = 0; a < 3; a++) {
			System.out.print(diagonalP[a]+ " ");
		}
		System.out.println("\nA soma da diagonal principal é: " + somaPrincipal);
		
		System.out.println("Diagonal Secundária:");
        for (int b = 0; b < 3; b++) {
            System.out.print(matriz[b][2 - b] + " ");
            somaSecundaria += matriz[b][2 - b];
        }
        System.out.println("\nA soma da diagonal secundaria é: "+ somaSecundaria);
	}

}
