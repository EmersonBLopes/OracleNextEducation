import {clienteService} from "../services/cliente-service.js";

const tabelaClientes = document.querySelector("[data-tabela]");

export default function adicionarCliente(nome, email) {
  const informacoesDoCliente = `
    <td class="td" data-td>${nome}</td>
    <td>${email}</td>
    <td>
    <ul class="tabela__botoes-controle">
    <li><a href="../telas/edita_cliente.html" class="botao-simples botao-simples--editar">Editar</a></li>
    <li><button class="botao-simples botao-simples--excluir" type="button">Excluir</button></li>
    </ul>
    </td> 
    `;

  const elementoCliente = document.createElement("tr");
  elementoCliente.innerHTML = informacoesDoCliente;

  return elementoCliente;
}

clienteService.requisicaoHttp().then((data) => {
  data.forEach((cliente) => {
    tabelaClientes.appendChild(adicionarCliente(cliente.nome, cliente.email));
  });
});

