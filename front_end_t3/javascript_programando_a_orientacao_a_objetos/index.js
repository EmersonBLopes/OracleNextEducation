import {Cliente} from "./Cliente.js";
import {ContaCorrente} from "./ContaCorrente.js";

const cliente1 = new Cliente("Emerson","12334545670");
const cliente1ContaCorrente = new ContaCorrente("001",1000,cliente1);
cliente1ContaCorrente.cliente = cliente1;

const cliente2 = new Cliente("Jandira","12334545671");
const cliente2ContaCorrente = new ContaCorrente("002",1000,cliente1);
cliente2ContaCorrente.cliente = cliente2;

cliente1ContaCorrente.depositar(10000);

cliente1ContaCorrente.transferencia(5000,cliente2ContaCorrente);

console.log(cliente1ContaCorrente);
cliente1ContaCorrente.mostrarSaldo();
cliente2ContaCorrente.mostrarSaldo();
