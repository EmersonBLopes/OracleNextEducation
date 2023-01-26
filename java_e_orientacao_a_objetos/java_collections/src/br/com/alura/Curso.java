package br.com.alura;

import java.util.ArrayList;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Collections;
import java.util.Collection;
import java.util.List;
import java.util.HashMap;
import java.util.HashSet;

public class Curso {
	
	private String nome,instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	private Collection<Aluno> alunos = new HashSet<Aluno>();
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap();
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
		
		Aluno a = new Aluno(nome,matricula);
		
		alunos.add(a);
		matriculaParaAluno.put(a.getMatricula(),a);
	}
	
	public void matricula(Aluno aluno) {
		
		alunos.add(aluno);
		matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}
	
	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}
	
	public Aluno buscaMatricula(Integer matricula) {
		
		if(!matriculaParaAluno.containsKey(matricula)) throw new NoSuchElementException("Aluno não existe.");
		return matriculaParaAluno.get(matricula);
	}
	
	public int getTempoTotal() {
		
		return this.tempoTotal;
	}
}
