class Cliente{
  constructor(nome,cpf){
    this.nome = nome;
    this.cpf = cpf;
  }
};

class ContaCorrente{

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

const cliente1 = new Cliente("Emerson","12334545670");
const cliente1ContaCorrente = new ContaCorrente("001",1000);

console.log(cliente1,"\n",cliente1ContaCorrente);

cliente1ContaCorrente.depositar(10000);

cliente1ContaCorrente.transferencia(400,"Jandira");
