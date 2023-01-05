package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;

public class TestaPerformance {

	public static void main(String[] args) {
		
		Collection<Integer> numeros = new ArrayList<Integer>();
		
		long inicio = System.currentTimeMillis();
		
		for (int i = 1; i <= 800000; i++) {
			numeros.add(i);
		}
		
		for(Integer numero: numeros) {
			numeros.contains(numero);
		}
		
		long fim = System.currentTimeMillis();
		
		long tempoDeExecucao = fim - inicio;
		
		System.out.println("Tempo gasto: "+tempoDeExecucao);
	}
}
