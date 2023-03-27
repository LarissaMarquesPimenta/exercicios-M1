package poo;

public class Jogo extends Produto {
	
	private String genero; 
	private String plataforma;
	
	public Jogo(String nome, String tipo, String desenvolvedor, int ano, double valor, String genero,
			String plataforma) {
		super(nome, tipo, desenvolvedor, ano, valor);
		this.genero = genero;
		this.plataforma = plataforma;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	} 
	
	public void imprimirInfoJogo () {
		System.out.println(getNome());
		System.out.printf("Tipo: %s", getTipo());
		System.out.printf("\nDesenvolvedora: %s", getDesenvolvedor());
		System.out.printf("\nValor: " + getValor());
		System.out.println("\nAno de lançamento: " + getAno());
		System.out.println("Genero: " + getGenero());
		System.out.println("Pataforma: " + getPlataforma());
		System.out.println();
	}

}
