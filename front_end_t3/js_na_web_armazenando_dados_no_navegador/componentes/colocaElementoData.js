import criarData from "./criarData.js";

export function colocaElementoData(tarefa,dados){

  const lista = document.querySelector("[data-list]");

  if(document.querySelector(`[data-tarefa-data=\"${dados.data}\"]`) != null){
      const tarefaData = document.querySelector(`[data-tarefa-data=\"${dados.data}\"]`);
      tarefaData.appendChild(tarefa);
  }else{
      lista.appendChild(criarData(tarefa,dados));
  }
}
