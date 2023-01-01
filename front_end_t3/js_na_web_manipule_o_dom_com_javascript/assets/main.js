import BotaoConclui from "./../componentes/concluiTarefa.js";
import BotaoDeleta from "./../componentes/deletaTarefa.js";

const criarTarefa = () => {

    event.preventDefault();
    const valorInserido = document.querySelector("[data-form-input]");
    const tarefa = document.querySelector("[data-task]")

    const conteudo = document.createElement("li");
    conteudo.classList.add("task");
    conteudo.innerHTML = `<p class="content">${valorInserido.value}</p>`;

    conteudo.appendChild(BotaoConclui());
    conteudo.appendChild(BotaoDeleta());

    const lista = document.querySelector("[data-list]");

    lista.appendChild(conteudo);
    valorInserido.value = "";
}
  const novaTarefa = document.querySelector("[data-form-button]");


  novaTarefa.addEventListener("click", criarTarefa);
