package br.com.alura;

public class TestaCursoComAlunos {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Emerson");
		

		javaColecoes.adicionarAula("Trabalhando com ArrayList",21);
		javaColecoes.adicionarAula("Criando uma Aula",20);
		javaColecoes.adicionarAula("Modelando com coleções",22);
		
		javaColecoes.matricula("Fulano", 1234);
		javaColecoes.matricula("Fulaninho", 6543);
		javaColecoes.matricula("Outro Fulaninho", 1234578);
		javaColecoes.matricula("Fulanoooos", 123455678);
		
		System.out.println(javaColecoes.getListaDeAlunos());

	}

}
