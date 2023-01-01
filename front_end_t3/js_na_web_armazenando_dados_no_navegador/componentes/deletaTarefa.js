import {deletaDados} from "./deletaDados.js";

const BotaoDeleta = () => {
  const botaoDeleta = document.createElement("button");

  botaoDeleta.innerText = "deletar";
  botaoDeleta.addEventListener("click", deletarTarefa);

  return botaoDeleta;
};

const deletarTarefa = (evento) => {
  const botaoDeleta = evento.target;

  const tarefaCompleta = botaoDeleta.parentElement;

  deletaDados(tarefaCompleta);

  tarefaCompleta.remove();

  return botaoDeleta;
};

export default BotaoDeleta;
