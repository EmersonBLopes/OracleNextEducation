import bytebank.Conta;

public class CriaConta{

  public static void main(String[] args){

   Conta primeiraConta = new Conta();

   primeiraConta.depositar(200);
   primeiraConta.depositar(100);

   Conta segundaConta = new Conta();

   segundaConta.depositar(50);

   System.out.println("A primeira Conta tem: "+primeiraConta.getSaldo()+"\nA segunda Conta tem:"+segundaConta.getSaldo());

   //teste de referencia

    if(primeiraConta == segundaConta){
      System.out.println("São a mesma conta");
    }else{
      System.out.println("São Contas diferentes");
    }

    System.out.println("Primeira Conta: "+primeiraConta);
    System.out.println("Segunda Conta: "+segundaConta);
  }
}
