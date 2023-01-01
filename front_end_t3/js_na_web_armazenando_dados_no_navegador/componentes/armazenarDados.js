export function armazenarDados(dados){

  let indiceAtual = localStorage.length;

  if(indiceAtual==0){
    localStorage.setItem(indiceAtual,JSON.stringify(dados));
  }else{
    localStorage.setItem(indiceAtual++,JSON.stringify(dados));
  }
  return;
};
