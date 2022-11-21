//consumo da api utilizand o hxmlHttpRequest e promise para a resposta

// function requisicaoHttp() {
//   const promise = new Promise((resolve, reject) => {
//     const requisicaoHttp = new XMLHttpRequest();
//     const url = "http://localhost:3000/profile";

//     requisicaoHttp.onreadystatechange = (resposta) => {
//       if (requisicaoHttp.status >= 400) {
//         reject(JSON.parse(requisicaoHttp.response));
//       } else {
//         resolve(JSON.parse(requisicaoHttp.response));
//       }
//     };

//     requisicaoHttp.open("GET", url, true);
//     requisicaoHttp.send();
//   });
//   return promise;
// }

//consumno utilizando a fetch api
function requisicaoHttp() {
  const url = "http://localhost:3000/profile";
  return fetch(url).then( resposta => {
    return resposta.json();
  } );
}

export const clienteService = {
  requisicaoHttp
}
