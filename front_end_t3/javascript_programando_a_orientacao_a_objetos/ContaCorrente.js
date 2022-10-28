export class ContaCorrente{

  #saldo = 0;

  constructor(agencia,saldo){
    this.agencia = agencia;
  }

  depositar(valor){
    if(valor > 0){
      this.#saldo += valor;
      console.log("deposito realizado com sucesso!");
    }
  }

  saque(valor){
    if(!this.saldo<valor && !this.saldo<=0){
      this.#saldo -= valor;
      console.log("saque realizado com sucesso!");
    }  
  }

  transferencia(valor, beneficiado){
    if(this.#saldo>valor && this.#saldo>0){
      this.#saldo -= valor;
      console.log("transferência para "+beneficiado+" realizada com sucesso!");
    }
  }
}

