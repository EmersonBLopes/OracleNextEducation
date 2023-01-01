/*consumo da api utilizand o hxmlHttpRequest e promise para a resposta

 function requisicaoHttp() {
 const promise = new Promise((resolve, reject) => {
     const requisicaoHttp = new XMLHttpRequest();
     const url = "http://localhost:3000/profile";

     requisicaoHttp.onreadystatechange = (resposta) => {
       if (requisicaoHttp.status >= 400) {
         reject(JSON.parse(requisicaoHttp.response));
       } else {
         resolve(JSON.parse(requisicaoHttp.response));
       }
     };

     requisicaoHttp.open("GET", url, true);
     requisicaoHttp.send();
   });
   return promise;
 }*/

//consumo utilizando a fetch api
  

const url = "http://localhost:3000/profile";

function requisicaoHttp() {
  return fetch(url).then((resposta) => {
    return resposta.json();
  });
}

function adicionaCliente(dados) {
  return fetch(url, {
    method: "POST",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify(dados),
  }).then((resposta) => {
    return resposta.body;
  });
}

function removerCliente(id) {
  const clienteUrl = url + `/${id}`;
  return fetch(clienteUrl, {
    method: "DELETE",
  });
}

function detalhaCliente(id) {
  const clienteUrl = url + `/${id}`;
  return fetch(clienteUrl, {
    method: "GET",
  }).then((reposta) => {
    return reposta.json();
  });
}

function atualizaCliente(dados) {
    return fetch(url + `/${dados.id}`, {
    method: "PUT",
    headers: {
      "Content-type": "application/json",
    },
    body: JSON.stringify({
      nome: dados.nome,
      email: dados.email,
    })
  });
}

export const clienteService = {
  requisicaoHttp,
  adicionaCliente,
  removerCliente,
  detalhaCliente,
  atualizaCliente
};
