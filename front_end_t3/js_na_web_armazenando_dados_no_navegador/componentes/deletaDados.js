export function deletaDados(parentElement){
  
  const tarefaId = parentElement.dataset.tarefaId;

  localStorage.removeItem(tarefaId);

  return;

}
