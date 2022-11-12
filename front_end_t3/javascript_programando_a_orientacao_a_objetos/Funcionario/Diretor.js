import {Funcionario} from "./Funcionario.js";

export class Diretor extends Funcionario{
  constructor(nome,salario,cpf,bonificacao){
    super(nome,salario,cpf,bonificacao);
    this._bonificacao = 2;
  }
} 
