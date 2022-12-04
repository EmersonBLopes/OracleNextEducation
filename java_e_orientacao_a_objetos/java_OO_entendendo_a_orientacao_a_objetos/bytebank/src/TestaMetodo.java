import bytebank.Conta;

public class TestaMetodo{
  
  public static void main(String[] args){

    Conta contaDoEmerson = new Conta();
    Conta contaDoZeze = new Conta();

    contaDoZeze.depositar(1000);

    contaDoEmerson.depositar(1200);

    contaDoZeze.transfere(500,contaDoZeze);

    System.out.println(contaDoZeze.getSaldo()+" "+contaDoEmerson.getSaldo()); 
  }
}
