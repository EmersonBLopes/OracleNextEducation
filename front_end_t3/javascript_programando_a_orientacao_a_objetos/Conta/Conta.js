//classe abstrata somente deve ser herdada por outras classes nenhum objeto deve ser instanciado diretamente atraves desta classe

export class Conta {
  constructor(saldoInicial, cliente, agencia) {
    if (this.constructor == Conta) {
      throw new Error(
        "Você não deveria instanciar um objeto do tipo \"Conta\" deretamente"
      );
    } else {
      this._saldo = saldoInicial;
      this._cliente = cliente;
      this._agencia = agencia;
    }
  }

  set cliente(novoValor) {
    if (novoValor instanceof Cliente) {
      this._cliente = novoValor;
    }
  }

  get cliente() {
    return this._cliente;
  }

  get saldo() {
    return this._saldo;
  }

  //este método se trata de um método abstrato sendo assim deve ser sobrescrito pelas as classes filhas.
  sacar(valor) {
    throw new Error("O metodo sacar deve ser sobrescrito por um método de mesmo nome da classe filho pois, se trata de um método abstrato");
  }

  _sacar(valor, taxa) {
    const valorSacado = taxa * valor;
    if (this._saldo >= valorSacado) {
      this._saldo -= valorSacado;
      return valorSacado;
    }

    return 0;
  }

  depositar(valor) {
    this._saldo += valor;
  }

  tranferir(valor, conta) {
    const valorSacado = this.sacar(valor);
    conta.depositar(valorSacado);
  }
}
