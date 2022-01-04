console.log(`\n Trabalhando com loops \n`)

const cidades = new Array('Salvador', 'São Paulo', 'Rio de Janeiro', 'Porto Alegre', 'Curitiba', 'Belo Horizonte', 'Florianópolis', 'Belo Horizonte')
console.log(`Escolha um destino:`)
console.log(cidades)

const idadeComprador = 21;
const acompanhado = false;
let passagem = false;
const destino = 'Belo Horizonte';
//variavel criada   //puxa a idade          //outra condição
const podeComprar = idadeComprador >= 18 || acompanhado == true; //condições para entrar no i

let i = 0; //sempre inicia em 0
let destinoExiste = false; //mais uma condição
while (i < cidades.length) { //i até o numero de cidades
    if (cidades[i] == destino) { //SE array[vai contando] for igual == ao destino digitado
        destinoExiste = true; //ai é verdadeiro
        break;
    }
    i += 1; //aqui vai contando até o if for verdadeiro
}

console.log("Destino existe?", destinoExiste)

if (podeComprar && destinoExiste){
    console.log(`Boa viagem`)
} else [
    console.log(`Desculpe temos um erro!`)
]