import {Cliente} from "./Cliente.js";
import {ContaCorrente} from "./ContaCorrente.js";

const cliente1 = new Cliente("Emerson","12334545670");
const cliente1ContaCorrente = new ContaCorrente("001",1000);

console.log(cliente1,"\n",cliente1ContaCorrente);

cliente1ContaCorrente.depositar(10000);

cliente1ContaCorrente.transferencia(400,"Jandira");
