package br.com.alura;

public class Aluno {

	String nome;
	int matricula;
	
	public Aluno(String nome, int matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	@Override
	public String toString() {
		
		String mensagem;	
		mensagem = String.format("Aluno: %s Matricula: %d\n",this.nome,this.matricula);
		
		return mensagem;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public int getMatricula() {
		return this.matricula; 
	}
}
