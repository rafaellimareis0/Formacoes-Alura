console.log(`Trabalhando com condicionais parte 2`)

const destinos = new Array(`Salvador`, `São Paulo`, `Rio de Janeiro`, `Porto Alegre`, `Curitiba`, `Belo Horizonte`, `Florianópolis`, `Belo Horizonte`)

const idadeComprador = 17;
const acompanhado = true;
if (idadeComprador >= 18) {
    console.log(`Os destinos que você pode escolher são: ${destinos}`)
    console.log(`O destino escolhido foi ${destinos.splice(1, 1)}`) //mostrar cidade escolhida
} else if (acompanhado == true) {
    console.log(`Os destinos que você pode escolher são: ${destinos}`)
    console.log(`O destino escolhido foi ${destinos.splice(1, 1)}`) //mostrar cidade escolhida
} else {
    console.log(`Você não pode escolher uma cidade por ser menor de idade`)
}

console.log(`Os destinos que sobraram pacotes são ${destinos}`)