const deletarTarefa = (event) =>{
  const botaoDeleta = event.target;

  const tarefaCompleta = botaoDeleta.parentElement;

  tarefaCompleta.remove();
}

  const BotaoDeleta = () => {
    const botaoDeleta = document.createElement("button");
    botaoDeleta.innerText = "deletar";
    botaoDeleta.addEventListener("click",deletarTarefa);

    return botaoDeleta;
  }

export default BotaoDeleta;
