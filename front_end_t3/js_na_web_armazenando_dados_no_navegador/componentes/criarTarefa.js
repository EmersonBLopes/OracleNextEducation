import BotaoConclui from "./concluiTarefa.js";
import BotaoDeleta from "./deletaTarefa.js";
import {colocaElementoData} from "./colocaElementoData.js";

export const criarTarefa = (dados,tarefaId) => {

  if(tarefaId == undefined){
    tarefaId = localStorage.length;
  };

  const tarefa = document.createElement("li");

  tarefa.classList.add("task");

  const conteudo = `<p class="content">${dados.data} * ${dados.valor} </p>`;

  tarefa.dataset.tarefaId = tarefaId;
  tarefa.innerHTML = conteudo;

  tarefa.appendChild(BotaoConclui());
  tarefa.appendChild(BotaoDeleta());
  colocaElementoData(tarefa,dados);
};

