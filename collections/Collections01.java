// O usuario deve digitar 5 cores, o programa deve mostrar as cores que foram adicionadas e depois mostar ordenadas

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Collections01 {

	public static void main(String[] args) {
		
	List<String> cores = new ArrayList<String>();
	String cor;
	Scanner leia = new Scanner(System.in);
	
	for(int i = 0; i < 5; i++) {
		System.out.println("\nDigite uma cor: ");
		cor = leia.nextLine();
		cores.add(cor); 
	}
	System.out.println(cores);
	// para ordenar os elementos:
	Collections.sort(cores);
	System.out.println("\nOrdenando as cores em ordem crescente: ");
	System.out.println(cores);
	}
	

}
