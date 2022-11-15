import {criarTarefa} from "./criarTarefa.js";

export function carregarTarefas(){

  const index = Object.keys(localStorage);

  index.map((localStorageIndex) => {
    criarTarefa(JSON.parse(localStorage[localStorageIndex]),localStorageIndex);
  })

}
