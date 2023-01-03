package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome,instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
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
	
	public void adicionarAula(String titulo, int duracao) {
		
		aulas.add(new Aula(titulo,duracao));
		this.tempoTotal += duracao;
	}
	
	public int getTempoTotal() {
		
		return this.tempoTotal;
	}
}
