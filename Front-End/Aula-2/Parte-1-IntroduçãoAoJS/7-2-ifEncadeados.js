console.log(`Trabalhando com condicionais parte 3`)

const destinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`, `Porto Alegre`, `Curitiba`, `Belo Horizonte`, `Florianópolis`, `Belo Horizonte`)

const idadeComprador = 21;
const acompanhado = false;
const temPassagem = true;

if (idadeComprador >= 18 || acompanhado == true) {
    console.log(`Você comprou o pacote e a cidade escolhida foi ${destinos.splice(2, 1)}, faça uma boa viagem!!`)
} else {
    console.log(`Você não pode comprar nenhum pacote por ser menor de idade e estar desacompanhado`)
}

console.log(`Os destinos que ainda sobraram pacotes são ${destinos}`)

//operadores lógicos
// OU ||
// E &&
// diferente |= 