package br.com.alura;

public class TestaCurso {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Instrutor Emerson");
		

		javaColecoes.adicionarAula("Trabalhando com ArrayList",21);
		javaColecoes.adicionarAula("Criando uma Aula",20);
		javaColecoes.adicionarAula("Modelando com coleções",22);
		
		System.out.println(javaColecoes.getListaDeAulas());
		
	}
}
