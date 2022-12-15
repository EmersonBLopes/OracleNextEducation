package br.com.alura;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prioridade pMin = Prioridade.MIN;
		Prioridade pMax = Prioridade.MAX;

		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println("O valor de pMin é: "+pMin.getValor());
		System.out.println("O valor de pMax é: "+pMax.getValor());
	}

}
