//criar uma collection set de wrapped int para o usuario digitar os elementos não repetidos 
//mostrar todos os elementos usando o iterator 

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Collections03 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		int n; 
		
		
		System.out.println("Digite 10 numeros: ");
		for(int i = 0; i < 10; i++) {
			n = leia.nextInt();
			numeros.add(n);			
			
		}
		Collections.sort(numeros);
		Set<Integer> numerosSet = new HashSet<Integer> (numeros);
		Iterator<Integer> itSet = numerosSet.iterator(); 
		System.out.println("Listar dados do set: ");
		while(itSet.hasNext()) {
			System.out.println(itSet.next());
			
		}
		}
		

	}

