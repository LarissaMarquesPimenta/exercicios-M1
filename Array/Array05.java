// Escrever um programa que lê duas matrizes N1(3,2) N2(3,2) e:
// Cria uma matris M1 cujos elementos sejam a soma de n1 e n2

package Array;

import java.util.Scanner;

public class Array05 {

	public static void main(String[] args) {
		
		//variaveis 
		int[][] N1 = new int[3][2]; 
		int [][] N2 = new int[3][2];
		int elemento;
		
		//Scanner 
		Scanner leia = new Scanner(System.in);
		
		// lê duas matrizes 
		System.out.println("Escreva a matriz N1");
		for (int i = 0; i < 3; i++) {
			for(int j = 0; j < 2; j++) {
				N1[i][j] = leia.nextInt();
				
			}
		}

	}

}
