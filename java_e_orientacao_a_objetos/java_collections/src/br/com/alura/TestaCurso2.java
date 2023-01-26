package br.com.alura;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Emerson");
		

		javaColecoes.adicionarAula("Trabalhando com ArrayList",21);
		javaColecoes.adicionarAula("Criando uma Aula",20);
		javaColecoes.adicionarAula("Modelando com coleções",22);
		
		System.out.println(javaColecoes.getListaDeAulas());
		
		List<Aula> aulasMutaveis = new ArrayList<Aula>(javaColecoes.getListaDeAulas());
		
		Collections.sort(aulasMutaveis);
		
		System.out.println(aulasMutaveis);
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);

	}
}
