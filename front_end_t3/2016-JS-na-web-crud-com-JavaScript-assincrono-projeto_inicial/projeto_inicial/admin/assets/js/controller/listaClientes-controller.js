import {clienteService} from "../services/cliente-service.js";

const tabelaClientes = document.querySelector("[data-tabela]");

function adicionarCliente(nome, email, id) {
  const informacoesDoCliente = `
    <td class="td" data-td=${id}>${nome}</td>
    <td>${email}</td>
    <td>
    <ul class="tabela__botoes-controle">
    <li><a href="../telas/edita_cliente.html?id=${id}" class="botao-simples botao-simples--editar">Editar</a></li>
    <li><button class="botao-simples botao-simples--excluir" type="button">Excluir</button></li>
    </ul>
    </td> 
    `;
  const elementoCliente = document.createElement("tr");
  elementoCliente.innerHTML = informacoesDoCliente;

  return elementoCliente;
}

tabelaClientes.addEventListener("click",(event)=>{
  const ehBotaoExcluir = event.target.className == "botao-simples botao-simples--excluir";

  if(ehBotaoExcluir){
    let tdCliente = event.target.closest("tr");
    let clienteId = tdCliente.querySelector("[data-td]").dataset.td
    clienteService.removerCliente(clienteId).then(()=>{
      tdCliente.remove();
    });
  }
})

clienteService.requisicaoHttp().then((data) => {
  data.forEach((cliente) => {
    tabelaClientes.appendChild(adicionarCliente(cliente.nome, cliente.email, cliente.id));
  });
});

