package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Iterator;

import javaLang.Carro;
import javaLang.Moto;

public class Teste {
	public static void main(String[] args) {
		
		ArrayList lista = new ArrayList();
		
		lista.add(new Carro("branco","188"));
		lista.add(new Moto("verde","128"));
		
		//System.out.println(lista.size());
		try{
			System.out.println(lista.get(2));
		}catch(IndexOutOfBoundsException ex) {
			System.out.println("O indice não existe");
		}
		
		/*for(int i = 0; i <= lista.size(); i++){
			
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}*/
		
		// for comunmente usado para arraylist
		
		for(Object oRef : lista) {
			System.out.println(oRef);
		}
	}
}
