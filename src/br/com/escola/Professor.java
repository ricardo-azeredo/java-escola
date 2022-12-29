package br.com.escola;

public class Professor {
	//atributos
	private String nome;
	private String titulacao;
	
	//construtor
	public Professor() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTitulacao() {
		return titulacao;
	}
	
	public void setTitulacao(String titulacao) {
		this.titulacao = titulacao;
	}
	
	public void mostrarProfessor() {
		String professor = "O professor "+ getNome()+" e "+getTitulacao();
		System.out.println(professor);
	}
	
}
