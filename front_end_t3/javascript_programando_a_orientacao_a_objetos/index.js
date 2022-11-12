import {Cliente} from "./Cliente.js";
import {ContaCorrente} from "./Conta/ContaCorrente.js";
import { ContaPoupanca } from "./Conta/ContaPoupanca.js";
import {ContaSalario} from "./Conta/ContaSalario.js";
import {Conta} from "./Conta/Conta.js";

const cliente1 = new Cliente("Ricardo", 11122233309);
const contaSalario = new ContaSalario(cliente1);

contaSalario.depositar(100);
contaSalario.sacar(50);
console.log(contaSalario);


