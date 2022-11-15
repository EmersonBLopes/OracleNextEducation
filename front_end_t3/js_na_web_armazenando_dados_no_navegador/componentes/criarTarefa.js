import BotaoConclui from "./concluiTarefa.js";
import BotaoDeleta from "./deletaTarefa.js";

export const criarTarefa = (dados) => {

  const lista = document.querySelector("[data-list]");

  const tarefa = document.createElement("li");

  tarefa.classList.add("task");

  const conteudo = `<p class="content">${dados.data} * ${dados.valor}</p>`;

  tarefa.innerHTML = conteudo;

  tarefa.appendChild(BotaoConclui());
  tarefa.appendChild(BotaoDeleta());
  lista.appendChild(tarefa);
};

