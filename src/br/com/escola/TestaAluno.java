package br.com.escola;

public class TestaAluno {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();
		
		aluno.setNome("Ricardo Azeredo");
		aluno.setMatricula(1105);
		aluno.mostrarAluno();
		
		Aluno aluno2 = new Aluno("José das Couves",1106);
		aluno2.mostrarAluno();
	}
}
