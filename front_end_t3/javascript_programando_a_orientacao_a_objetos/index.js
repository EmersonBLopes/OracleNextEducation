class Cliente{

  constructor(nome,cpf){
    this.nome = nome;
    this.cpf = cpf;
  }
};

class ContaCorrente{

  constructor(agencia,saldo){
    this.agencia = agencia;
    this.saldo = saldo;
  }

  depositar(valor){
    this.saldo = this.saldo + valor;
    console.log("deposito realizado com sucesso!");
  }

}

const cliente1 = new Cliente("Emerson","12334545670", "001", 1000);
const cliente1ContaCorrente = new ContaCorrente("001",0);

console.log(cliente1,"\n",cliente1ContaCorrente);

cliente1ContaCorrente.depositar(600);
console.log(cliente1ContaCorrente.saldo);
