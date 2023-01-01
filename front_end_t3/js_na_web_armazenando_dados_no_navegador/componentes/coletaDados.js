import {criarTarefa} from "./criarTarefa.js";
import {armazenarDados} from "./armazenarDados.js";

export const handleNovoItem = (evento) => {
  evento.preventDefault();

  const input = document.querySelector("[data-form-input]");
  const valor = input.value;

  const calendario = document.querySelector("[data-form-date]");
  const data = moment(calendario.value).format("DD/MM/YYYY");

  const dados = {
    valor,
    data,
  };

  criarTarefa(dados);
  armazenarDados(dados);
  input.value = "";
};
