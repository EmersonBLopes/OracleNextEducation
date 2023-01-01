import bytebank.Conta;

public class TesteReferencia{

  public static void main(String[] args){

    Conta primeiraConta = new Conta();
    primeiraConta.depositar(300);

    Conta segundaConta = primeiraConta;

    if(primeiraConta == segundaConta){
      System.out.println("São a mesma conta");
    }else{
      System.out.println("São Contas diferentes");
    }

    System.out.println("Primeira Conta: "+primeiraConta);
    System.out.println("Segunda Conta: "+segundaConta);
  }
} 
