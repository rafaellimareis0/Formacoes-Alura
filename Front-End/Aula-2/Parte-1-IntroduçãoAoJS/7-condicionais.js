console.log(`Trabalhando com condicionais`)

const destinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`, `Porto Alegre`, `Curitiba`, `Belo Horizonte`, `Florianópolis`, `Belo Horizonte`)
console.log(`Destinos possíveis: ${destinos}`)

const idadeComprador = 17;
const estaAcompanhada = true;

if (idadeComprador >= 18) {
    console.log(`Comprador maior de idade`)
    destinos.splice(1, 1); //removendo sao paulo pq ele comprou
    console.log(destinos)
} else if (estaAcompanhada) {
    console.log(`Comprador está acompanhado`)
    destinos.splice(1, 1); //removendo sao paulo pq ele comprou acompanhado
} else {
    console.log(`Comprador menor de idade`)
}


//trabalhando com operadores booleanos
// console.log(idadeComprador > 18)
// console.log(idadeComprador < 18)
// console.log(idadeComprador >= 18)
// console.log(idadeComprador <= 18)
// console.log(idadeComprador == 18)