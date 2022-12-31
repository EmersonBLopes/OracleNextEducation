package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;


public class TestandoListas {

	public static void main(String args[]) {
		
		ArrayList<String> aulas = new ArrayList<>();
		
		aulas.add("Primeira Aula");
		aulas.add("Segunda Aula");
		aulas.add("Terceira Aula");
		aulas.add("Quarta Aula");
		
		
		/*for(String aula : aulas) {
			System.out.println(aula);
		}*/
		
		aulas.forEach(aula -> System.out.println(aula));
		
		Collections.sort(aulas);
		
		aulas.forEach(aula->System.out.println(aula));
	}

}
