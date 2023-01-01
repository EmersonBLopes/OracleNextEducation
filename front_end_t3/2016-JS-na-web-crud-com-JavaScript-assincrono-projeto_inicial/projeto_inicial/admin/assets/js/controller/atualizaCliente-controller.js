import { clienteService } from "../services/cliente-service.js";

const pegaURL = new URL(window.location);
const id = pegaURL.searchParams.get("id");
const campoNome = document.querySelector("[data-nome]");
const campoEmail = document.querySelector("[data-email]");
const formulario = document.querySelector("[data-form]");

function preencheCampos() {
  clienteService.detalhaCliente(id).then((dadosCliente) => {
    campoNome.value = dadosCliente.nome;
    campoEmail.value = dadosCliente.email;
  });
}

addEventListener("load", preencheCampos);

formulario.addEventListener("submit", (event) => {
  event.preventDefault();
  const dadosCliente = {
    id : id,
    nome: campoNome.value,
    email: campoEmail.value
  };

  clienteService.atualizaCliente(dadosCliente).then(() => {
    window.location.href = "../../../telas/edicao_concluida.html";
  });
});
