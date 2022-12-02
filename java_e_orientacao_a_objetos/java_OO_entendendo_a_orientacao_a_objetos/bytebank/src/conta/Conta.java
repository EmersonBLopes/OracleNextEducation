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

  public void transfere(double valor, Conta destino){

    if(this == destino){
      System.out.println("Não é possível realizar transferência para a mesma conta");
      return;
    }


    if(sacar(valor)){
      destino.depositar(valor);
      System.out.println("Transferência realizada com sucesso!");
    }else{
      System.out.println("Erro ao realizar a transferência.");
    }
  }

}
