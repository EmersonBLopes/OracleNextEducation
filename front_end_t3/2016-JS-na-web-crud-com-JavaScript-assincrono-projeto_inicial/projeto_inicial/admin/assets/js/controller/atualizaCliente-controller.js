import { clienteService } from "../services/cliente-service.js";

const pegaURL = new URL(window.location);
const id = pegaURL.searchParams.get("id");

function preencheCampos() {
  const campoNome = document.querySelector("[data-nome]");
  const campoEmail = document.querySelector("[data-email]");

  clienteService.detalhaCliente(id).then((dadosCliente) => {
    campoNome.value = dadosCliente.nome;
    campoEmail.value = dadosCliente.email;
  });
}

addEventListener("load", preencheCampos);
