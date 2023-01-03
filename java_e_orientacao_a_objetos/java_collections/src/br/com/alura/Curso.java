package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Curso {
	
	private String nome,instrutor;
	private List<Aula> aulas = new ArrayList<Aula>();
	
	public Curso(String nome,String instrutor) {
		
		this.nome = nome;
		this.instrutor = instrutor;
		
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
	}
}
