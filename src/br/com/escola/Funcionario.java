package br.com.escola;

public abstract class Funcionario {
	private String nome;
	private String titulacao;
	
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
	
	public void mostrarFuncionario() {
		String funcionario = "O funcionário " + getNome() +" e " + getTitulacao();
		System.out.println(funcionario);
	}
}
