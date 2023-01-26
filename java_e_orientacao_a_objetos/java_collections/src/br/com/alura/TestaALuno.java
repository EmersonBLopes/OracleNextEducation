package br.com.alura;

import java.util.Set;
import java.util.HashSet;

public class TestaALuno {

	public static void main(String[] input) {
		
		/**
		 * Coleções não garante a ordem dos elementos sendo assim, não possui indíces ou métodos que trabalham com indíces.
		 * Coleções não permitem a adição de elementos duplicados.
		 * Hashs utilizam tabela de dispeção tornando o processo de busca por elemento mais rápido.
		 */
		
		Set<String> alunos = new HashSet<String>();
		
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Nico");
		alunos.add("Paulo");
		
		System.out.println(alunos.size());
	}
}
