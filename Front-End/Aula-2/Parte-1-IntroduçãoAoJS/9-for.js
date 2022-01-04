//Trabalhando com FOR

// for (let i = 1; i <= 5; i++) {
//     console.log('Estou aprendendo')
// }

// for (let ii = 0; ii <= 15; ii++) {
//     if (ii % 2 !== 0){
//         console.log(ii)
//     }
// }


console.log(`\n Trabalhando com loops \n`)

const cidades = new Array('Salvador', 'São Paulo', 'Rio de Janeiro', 'Porto Alegre', 'Curitiba', 'Belo Horizonte', 'Florianópolis', 'Belo Horizonte')
console.log(`Escolha um destino:`)
console.log(cidades)

const idadeComprador = 20;
const acompanhado = false;
let passagem = false;
const destino = 'São Paulo';
//variavel criada   //puxa a idade          //outra condição
const podeComprar = idadeComprador >= 18 || acompanhado == true; //condições para entrar no i
let i = 0; //sempre inicia em 0
let destinoExiste = false; //mais uma condição

for (i = 0; i < 8; i++) {
    if (cidades[i] == destino) {
        destinoExiste = true;
        console.log(`Destino escolhido: ${destino}`)
        break;
    }
}

// while (i < 8) { //i até o numero de cidades
//     if (cidades[i] == destino) { //SE array[vai contando] for igual == ao destino digitado
//         destinoExiste = true; //ai é verdadeiro
//         break;
//     }
//     i += 1; //aqui vai contando até o if for verdadeiro
// }

console.log("Destino existe?", destinoExiste)

if (podeComprar && destinoExiste) {
    console.log(`Boa viagem`)
} else {
    console.log(`Desculpe temos um erro!`)
}