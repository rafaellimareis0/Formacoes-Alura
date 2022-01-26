console.log(`Trabalhando com listas`)

// const salvador = `Salvador`;
// const saoPaulo = `São Paulo`;
// const rioDeJaneiro = `Rio de Janeiro`;

// console.log(`Destinos possívveis:`)
// console.log(salvador, saoPaulo, rioDeJaneiro)

//criando lista segundo o MDN Web Docs
let frutas = ['Maçã', 'Banana'];
console.log(frutas.length);

//a melhor forma de fazer a lista é com new array
const destinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`, `Curitiba`);

destinos.push(`Porto Alegre`) //adicionar item a ultima posição da lista

console.log(`Destinos possíveis:`)
console.log(destinos)

//para mostrar somente 1 item da lista
console.log(destinos[0]) //posicao do item na lista

//excluir 1 item da lista, chama a lista.splice(qual item, quantidade depois desse item)
destinos.splice(1, 2) //excluiu sao paulo e rio
console.log(destinos)