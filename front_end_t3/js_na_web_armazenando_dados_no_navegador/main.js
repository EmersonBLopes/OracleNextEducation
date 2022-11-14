import BotaoConclui from "./componentes/concluiTarefa.js";
import BotaoDeleta from "./componentes/deletaTarefa.js";

const criarTarefa = (dados) => {

  const tarefa = document.createElement("li");

  tarefa.classList.add("task");

  const conteudo = `<p class="content">${dados.data} * ${dados.valor}</p>`;

  tarefa.innerHTML = conteudo;

  tarefa.appendChild(BotaoConclui());
  tarefa.appendChild(BotaoDeleta());
  dados.lista.appendChild(tarefa);
};

const handleNovoItem = (evento) => {
  evento.preventDefault();

  const lista = document.querySelector("[data-list]");
  const input = document.querySelector("[data-form-input]");
  const valor = input.value;

  const calendario = document.querySelector("[data-form-date]");
  const data = moment(calendario.value).format("DD/MM/YYYY");
  // data data;

  const dados = {
    valor,
    data,
    lista
  };

  criarTarefa(dados);
  input.value = "";
};

const novaTarefa = document.querySelector("[data-form-button]");

novaTarefa.addEventListener("click", handleNovoItem);
