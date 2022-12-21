package javaLang;

public class TesteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nome = "EMERSON";
		
		nome = nome.toLowerCase();
		String outroNome = nome.substring(2);
		
		for(int i = 0; i< nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
		System.out.println(outroNome);
		System.out.println(nome);
	}

}
