import {Cliente} from "./Cliente.js";
import {Gerente} from "./Funcionario/Gerente.js";
import {Diretor} from "./Funcionario/Diretor.js";
import {SistemaAutenticacao} from "./SistemaAutenticacao.js";

const diretor = new Diretor("Rodrigo", 10000, 123456789);
const gerente = new Gerente("Ricardo",5000,13456789);
const cliente = new Cliente("Pedro",123456,"123465")

diretor.cadastrarSenha("123456");
gerente.cadastrarSenha("01020304")

console.log(SistemaAutenticacao.login(cliente,"123465"));


