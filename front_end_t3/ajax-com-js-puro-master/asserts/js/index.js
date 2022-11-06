const inputCep = document.querySelector("input[name=cep]");
let formulario = document.querySelector("[data-formulario]");

function preencheCampos(resposta){
  let campos = document.getElementsByClassName("o-form__data");

  objetoReposta = JSON.parse(resposta);

  campos[1].value = objetoReposta.logradouro;
  campos[3].value = objetoReposta.bairro;
  campos[4].value = objetoReposta.complemento;
  campos[5].value = objetoReposta.localidade;
  campos[6].value = objetoReposta.uf;

}


function buscaCep() {
  let cep = inputCep.value.replace("-","");

  let url = `https://viacep.com.br/ws/${cep}/json`;
  let xhr = new XMLHttpRequest();
  console.log(url);
  xhr.open("GET", url, true);

  xhr.onreadystatechange = function () {
    if (xhr.readyState == 4) {
      if (xhr.status = 200) {
        preencheCampos(xhr.responseText);
      }
    }
  }
  xhr.send();
}

formulario.addEventListener("submit", (event) =>{
  event.preventDefault();
})
