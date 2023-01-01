package aula_04;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o seu nome:");
		
		String nome = sc.next();
		
		System.out.println(nome);
		
		sc.close();
		
	}

}
