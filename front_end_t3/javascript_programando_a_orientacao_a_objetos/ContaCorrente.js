export class ContaCorrente{

  //campo privado
  
  #saldo = 0;

  //campo público 


  constructor(agencia,saldo,cliente){
    this.agencia = agencia;
    this.cliente = cliente;
  }

  mostrarSaldo(){
    console.log(this.#saldo);
  }

  depositar(valor){
    if(valor > 0){
      this.#saldo += valor;
      console.log("deposito realizado com sucesso!");
    }
  }

  saque(valor){
      this.#saldo -= valor;
  }

  transferencia(valor, beneficiado){
    if(this.#saldo>valor && this.#saldo>0){
      this.saque(valor);
      beneficiado.depositar(valor);
      console.log("transferência para "+beneficiado.cliente.nome+" realizada com sucesso!");
    }else{
      console.log("Saldo insuficiente");
    }
  }
}

