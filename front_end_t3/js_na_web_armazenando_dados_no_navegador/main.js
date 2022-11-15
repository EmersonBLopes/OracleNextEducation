import {handleNovoItem} from "./componentes/coletaDados.js";
import {criarTarefa} from "./componentes/criarTarefa.js";
import {carregarTarefas} from "./componentes/carregarTarefas.js";

const novaTarefa = document.querySelector("[data-form-button]");

novaTarefa.addEventListener("click", handleNovoItem);

addEventListener("load",carregarTarefas);
