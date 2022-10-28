import {Cliente} from "./Cliente.js";

export class ContaCorrente{

  //campo privado
  
  #saldo = 0;
  #cliente;

  //campo público 

  set cliente(cliente){
    if(cliente instanceof Cliente){
      this.#cliente = cliente;
    }
  }

  get cliente(){
    return this.#cliente;
  }

  get saldo(){
    return this.#saldo;
  }

  constructor(agencia,saldo,cliente){
    this.agencia = agencia;
    this.cliente = cliente;
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

