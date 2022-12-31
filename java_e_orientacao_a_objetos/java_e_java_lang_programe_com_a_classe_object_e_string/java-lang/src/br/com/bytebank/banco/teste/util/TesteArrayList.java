package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import javaLang.Carro;
import javaLang.Moto;

public class TesteArrayList {
	public static void main(String[] args) {
		
		//sintaxe generic
		//ArrayLista<Carro> listaDeCarros = new Arraylist<Carro>();
		//nova sintaxe de generics java 1.7
		ArrayList<Carro> listaDeCarros = new ArrayList<>();
		
		listaDeCarros.add(new Carro("branco","188"));
		//listaDeCarros.add(new Moto("verde","128"));
		
		//System.out.println(listaDeCarros.size());
		try{
			System.out.println(listaDeCarros.get(2));
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("O indice não existe");
		}
		
		/*for(int i = 0; i <= listaDeCarros.size(); i++){
			
			Object oRef = listaDeCarros.get(i);
			System.out.println(oRef);
		}*/
		
		// for comunmente usado para arraylist
		
		for(Object oRef : listaDeCarros) {
			System.out.println(oRef);
		}
	}
}
