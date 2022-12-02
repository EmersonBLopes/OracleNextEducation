public class Conta{

  double saldo;
  int agencia, numero;
  String titular;

  public void depositar(double valor){
   
      this.saldo += valor;
      return;
  }

  public boolean sacar(double valor){

    if(valor > this.saldo){
      return false;
    }else{
      this.saldo -= valor;
      return true;
    }
    
  }

}
