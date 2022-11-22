import {clienteService} from "../services/cliente-service.js";

const formulario = document.querySelector("[data-form]");

console.log(formulario),

formulario.addEventListener("submit",(event)=>{
  event.preventDefault();

  const nome = document.querySelector("[data-nome]").value;
  const email = document.querySelector("[data-email]").value;

  const dados = {
    nome,
    email
  }
  clienteService.adicionaCliente(dados);
})
