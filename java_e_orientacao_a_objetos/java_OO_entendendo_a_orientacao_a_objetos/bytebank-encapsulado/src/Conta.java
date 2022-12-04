package bytebank;

public class Conta{

    private double saldo;
    private int agencia, numero;
    private Cliente titular;

    public Cliente getTitular(){
      return this.titular;
    }

    public int getAgencia(){
      return this.agencia;
    }

    public int getNumero(){
      return this.numero;
    }

    public double getSaldo(){
      return this.saldo;
    }

    public void setTitular(Cliente titular){
      this.titular = titular;
    }

    public void setAgencia(int agencia){
      this.agencia = agencia;
    }

    public void setNumero(int numero){
      this.numero = numero;
    }


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
