package bytebank;

public class Conta{

    private double saldo;
    private int agencia, numero;
    private Cliente titular;
    private static int totalDeContas;

    public Conta(int agencia, int numero){
      Conta.totalDeContas++;
      if(agencia >=0 && numero >=0){
        this.numero = numero;
        this.agencia = agencia;
      }else{
        System.out.println("O numero da conta e agencia não podem ser menor do que 0");
      }

    }

    public static int getTotalDeContas(){
      return Conta.totalDeContas;
    }

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
