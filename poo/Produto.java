package poo;

public class Produto {
	
	private String nome, tipo, desenvolvedor; 
	private int ano; 
	private double valor;
	
	public Produto(String nome, String tipo, String desenvolvedor, int ano, double valor) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.desenvolvedor = desenvolvedor;
		this.ano = ano;
		this.valor = valor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getDesenvolvedor() {
		return desenvolvedor;
	}
	public void setDesenvolvedor(String desenvolvedor) {
		this.desenvolvedor = desenvolvedor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void descontoProduto(double desconto) {
		valor *= 1 - desconto / 100;
		System.out.printf("\nNovo valor de %s: %.2f", nome, valor);
	}
	
	public void visualizar() {
		System.out.printf("\nNome: %s", nome);
		System.out.printf("\nTipo: %s", tipo);
		System.out.printf("\nDesenvolvedora: %s", desenvolvedor);
		System.out.printf("\nValor: " + valor);
		System.out.println("\nAno de lançamento: " + ano);
	} 
	
	
}
