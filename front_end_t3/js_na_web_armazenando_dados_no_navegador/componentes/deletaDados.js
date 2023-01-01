export function deletaDados(tarefa){

  const elementoPai = tarefa.parentElement;
  
  const tarefaId = tarefa.dataset.tarefaId;

  localStorage.removeItem(tarefaId);

  if(elementoPai.childElementCount-1 == 1){
    elementoPai.remove();
  };

  return;

}
