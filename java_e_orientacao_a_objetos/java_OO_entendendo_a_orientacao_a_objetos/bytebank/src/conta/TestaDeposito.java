public class TestaDeposito{
  
  public static void main(String[] args){

    Conta contaDoEmerson = new Conta();


    contaDoEmerson.depositar(1200);
    boolean retorno = contaDoEmerson.sacar(1400);
    
    System.out.println(contaDoEmerson.saldo+""+retorno); 
  }
}
