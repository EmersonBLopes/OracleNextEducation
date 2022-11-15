export function armazenarDados(dados){

  let indiceAtual = localStorage.length;

  if(indiceAtual==0){
    localStorage.setItem(`tarefa${indiceAtual}`,JSON.stringify(dados));
  }else{
    localStorage.setItem(`tarefa${indiceAtual++}`,JSON.stringify(dados));
  }
  return;
};
