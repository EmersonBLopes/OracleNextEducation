export default function criarData(tarefa, dados) {
  const tarefaData = document.createElement("li");
  tarefaData.setAttribute("data-tarefa-data", `${dados.data}`);
  const dataTopo = document.createElement("p");
  dataTopo.classList.add("content-data");
  dataTopo.innerHTML = dados.data;
  tarefaData.appendChild(dataTopo);
  tarefaData.appendChild(tarefa);

  return tarefaData;
}
