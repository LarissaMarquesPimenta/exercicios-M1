package poo;

public class TesteCurso06 {

	public static void main(String[] args) {
		Curso06[] lista = new Curso06[03];
		
		lista[0] = new Curso06("Matemática", "Claudio", 40, 50, 250.59);
		lista[1] = new Curso06("Calculo", "Izabel", 75, 120, 1200.55);
		lista[2] = new Curso06("Computação", "Sonia", 50, 60, 250.59);
		
		
		for(Curso06 loop:lista) {
			loop.visualizar();
			System.out.println();
		}
	}

	
}
