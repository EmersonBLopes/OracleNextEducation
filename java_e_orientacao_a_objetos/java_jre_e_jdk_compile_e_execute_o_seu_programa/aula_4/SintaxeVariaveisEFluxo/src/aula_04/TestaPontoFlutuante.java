package aula_04;

import java.text.MessageFormat;

public class TestaPontoFlutuante {
	
	public static void main(String[] args) {
		
		String nome = "Gilberto";
		double salario = 2500.50;
		
		System.out.println(MessageFormat.format("Meu nome é {0}, recebo R${1} por mês",nome,salario));
		
		float divisao = 5.0f/2;
		
		System.out.println(divisao);		
		
	}
}
