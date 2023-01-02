package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {

	public static void main(String[] args) {
		
		ArrayList<Aula> listaDeAulas = new ArrayList<>();
		
		listaDeAulas.add(new Aula("Revistando as Arraylists",21));
		listaDeAulas.add(new Aula("Listas de objetos",15));
		listaDeAulas.add(new Aula("Relacionamento de listas e objetos",11));
		listaDeAulas.add(new Aula("Aula de listas e objetos",11));
		
		listaDeAulas.forEach(aula -> System.out.println(aula));
		
		Collections.sort(listaDeAulas);
		
		System.out.println("----------------------------------------");
		
		listaDeAulas.forEach(aula -> System.out.println(aula));
		
		listaDeAulas.forEach(aula -> System.out.println(aula.getTempo()));
		
		//É possível ordenar utilizando o método sort do ArrayList
		
		//Collections.sort(listaDeAulas, Comparator.comparing(Aula::getTempo));
		listaDeAulas.sort(Comparator.comparing(Aula::getTempo));
		
		System.out.println("----------------------------------------");
		
		listaDeAulas.forEach(aula -> System.out.println(aula.getTempo()));
	}
}
