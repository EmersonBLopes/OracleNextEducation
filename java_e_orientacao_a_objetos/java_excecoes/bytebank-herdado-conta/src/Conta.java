package bytebank;

import bytebank.exceptions.SaldoInsuficienteException;

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

    private boolean checaValor(double valor){

      //retorna true se o valor do saldo for maior do que o valor 

      if(!(valor > this.saldo)){
        return true;
      }else{
        return false;
      }

    }

    public void sacar(double valor){

      if(!(checaValor(valor))){
        throw new SaldoInsuficienteException("Operação de saque mal sucessedida, saldo insuficiente.\nSaldo: "+this.saldo+"\nValor de saque: "+valor);
      }else{
        this.saldo -= valor;
      }

    }

    public void transfere(double valor, Conta destino){

      if(this == destino){
        System.out.println("Não é possível realizar transferência para a mesma conta");
        return;
      }

      sacar(valor);
      destino.depositar(valor);
      System.out.println("Transferência realizada com sucesso!");
    }

}
