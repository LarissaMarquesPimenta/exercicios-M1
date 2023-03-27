package poo;

import java.util.Scanner;

public class TesteGame {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in); 
		
		Jogo Gris = new Jogo ("Gris", "Jogo", "Nomada Studio", 2018, 32.99, "aventura", "PC");; 	
		Jogo Celeste = new Jogo("Celeste", "Jogo", "Extremely OK Games", 2018, 36.99, "Indie", "PC");
		Console PS4 = new Console("PS4", "Console", "Sony Entretainment", 2013, 2649.00, "Orbit OS", 500);
			
		Gris.imprimirInfoJogo();
		Celeste.imprimirInfoJogo();
		PS4.imprimirInfoConsole();
		
		System.out.println("\n-------------------------------------");
		
		}
		
	}

