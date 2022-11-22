import {clienteService} from "../services/cliente-service.js";

const formulario = document.querySelector("[data-form]");

formulario.addEventListener("submit",(event)=>{
  event.preventDefault();

  const nome = document.querySelector("[data-nome]").value;
  const email = document.querySelector("[data-email]").value;

  const dados = {
    nome,
    email
  }

  clienteService.adicionaCliente(dados)
  .then(()=>{
    window.location.href = "../../../telas/cadastro_concluido.html";
  })
});
