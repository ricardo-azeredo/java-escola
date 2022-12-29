package br.com.escola;

public class Aluno {
	private String nome;
	private int matricula;
	
	public Aluno() {
		
	}
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
		mostrarAluno();
	}
	
	//getter and setter
	//Mesmo que um setter
	/*
	public void difinirNome(String nome) {
		this.nome = nome;
	}
	
	//getter
	public String obterNome() {
		return this.nome;
	}
	*/
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	//metodos
	public void mostrarAluno() {
		String alunosDescricao = "O aluno " + this.nome +" com a matricula "+ this.matricula;
		System.out.println(alunosDescricao);		
		
	}
	
}
