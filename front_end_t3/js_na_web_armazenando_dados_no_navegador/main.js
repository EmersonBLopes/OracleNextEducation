import BotaoConclui from "./componentes/concluiTarefa.js";
import BotaoDeleta from "./componentes/deletaTarefa.js";

function armazenarDados(dados){

  let indiceAtual = localStorage.length;

  if(indiceAtual==0){
    localStorage.setItem(indiceAtual,JSON.stringify(dados));
  }else{
    localStorage.setItem(indiceAtual++,JSON.stringify(dados));
  }
  return;
}

const criarTarefa = (dados) => {

  const lista = document.querySelector("[data-list]");

  const tarefa = document.createElement("li");

  tarefa.classList.add("task");

  const conteudo = `<p class="content">${dados.data} * ${dados.valor}</p>`;

  tarefa.innerHTML = conteudo;

  tarefa.appendChild(BotaoConclui());
  tarefa.appendChild(BotaoDeleta());
  lista.appendChild(tarefa);
};

const handleNovoItem = (evento) => {
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

const novaTarefa = document.querySelector("[data-form-button]");

novaTarefa.addEventListener("click", handleNovoItem);
