package br.com.alura;

public class TestaCursoComAlunos {

	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as coleções do Java","Emerson");
		

		javaColecoes.adicionarAula("Trabalhando com ArrayList",21);
		javaColecoes.adicionarAula("Criando uma Aula",20);
		javaColecoes.adicionarAula("Modelando com coleções",22);
		
		Aluno a1 = new Aluno("Gilvado", 123456);
		
		javaColecoes.matricula("Fulano", 1234);
		javaColecoes.matricula("Fulaninho", 6543);
		javaColecoes.matricula("Outro Fulaninho", 1234578);
		javaColecoes.matricula("Fulanoooos", 123455678);

		javaColecoes.matricula(a1);
		
		System.out.println("O aluno a1 esta matriculado?\n" +javaColecoes.estaMatriculado(a1));
		System.out.println(javaColecoes.getListaDeAlunos());
		
		System.out.println(javaColecoes.buscaMatricula(6543));

	}

}
