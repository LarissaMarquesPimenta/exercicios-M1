package poo;

public class Console extends Produto {
	
	private String sistemaOperacional;
	private int capacidade;
	
	
	public Console(String nome, String tipo, String desenvolvedor, int ano, double valor, String sistemaOperacional,
			int capacidade) {
		super(nome, tipo, desenvolvedor, ano, valor);
		this.sistemaOperacional = sistemaOperacional;
		this.capacidade = capacidade;
	}


	public String getSistemaOperacional() {
		return sistemaOperacional;
	}


	public void setSistemaOperacional(String sistemaOperacional) {
		this.sistemaOperacional = sistemaOperacional;
	}


	public int getCapacidade() {
		return capacidade;
	}


	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	} 
	
	public void imprimirInfoConsole () {
		System.out.println(getNome());
		System.out.printf("Tipo: %s", getTipo());
		System.out.printf("\nDesenvolvedora: %s", getDesenvolvedor());
		System.out.printf("\nValor: " + getValor());
		System.out.println("\nAno de lançamento: " + getAno());
		System.out.println("Sistema operacional: " + getSistemaOperacional());
		System.out.println("Capacidade: " + getCapacidade());
		System.out.println();
	} 

}
