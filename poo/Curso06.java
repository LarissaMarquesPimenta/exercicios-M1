package poo;

public class Curso06 {
	
	private String nome; 
	private String professor; 
	private int vagas;
	private int duracao;
	private double valor;
	public Curso06(String nome, String professor, int vagas, int duracao, double valor) {
		super();
		this.nome = nome;
		this.professor = professor;
		this.vagas = vagas;
		this.duracao = duracao;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getProfessor() {
		return professor;
	}
	public void setProfessor(String professor) {
		this.professor = professor;
	}
	public int getVagas() {
		return vagas;
	}
	public void setVagas(int vagas) {
		this.vagas = vagas;
	}
	public int getDuracao() {
		return duracao;
	}
	public void setDuracao(int duracao) {
		this.duracao = duracao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	} 
	
	public void visualizar() {
		System.out.printf("\nCurso: %s", nome);
		System.out.printf("\nProfessor: %s", professor);
		System.out.printf("\nVagas: %d", vagas);
		System.out.printf("\nDuração: %d", duracao);
		System.out.printf("\nValor: %.2f", valor);
	}

}
