package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.HashSet;

public class Curso {
	
	private String nome,instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Collection<Aluno> alunos = new HashSet<Aluno>();
	private int tempoTotal = 0;
	
	
	public Curso(String nome,String instrutor) {
		
		this.nome = nome;
		this.instrutor = instrutor;
	}
	
	@Override
	public String toString() {
		
		String mensagem;
		
		mensagem = String.format("Nome do curso: %s\n"
				+ "Instrutor: %s\n"
				+ "Carga horaria: %d\n"
				+ "Aulas: %s"
				,this.nome,this.instrutor,this.tempoTotal,this.aulas);
		
		return mensagem;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getInstrutor() {
		return this.instrutor;
	}
	
	public List<Aula> getListaDeAulas(){
		return Collections.unmodifiableList(this.aulas);
	}
	
	public Collection<Aluno> getListaDeAlunos(){
		
		return Collections.unmodifiableCollection(this.alunos);
	}
	
	public void adicionarAula(String titulo, int duracao) {
		
		aulas.add(new Aula(titulo,duracao));
		this.tempoTotal += duracao;
	}
	
	public void matricula(String nome, int matricula) {
		
		alunos.add(new Aluno(nome,matricula));
	}
	public int getTempoTotal() {
		
		return this.tempoTotal;
	}
}
