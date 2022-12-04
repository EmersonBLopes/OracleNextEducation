public class CriaConta{
  
  public static void main(String[] args){

   Conta primeiraConta = new Conta();

   primeiraConta.saldo = 200;
   primeiraConta.saldo += 100;

   Conta segundaConta = new Conta();

   segundaConta.saldo = 50;

   System.out.println("A primeira Conta tem: "+primeiraConta.saldo+"\nA segunda Conta tem:"+segundaConta.saldo);

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
