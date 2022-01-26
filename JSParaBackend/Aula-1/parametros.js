// //parametros de função

// function soma(numero1, numero2) {
//     return numero1 + numero2;
// }

// console.log(soma(2, 2))

// //concatenar parametros

// function nomeIdade(nome, idade) {
//     return `meu nome é ${nome} e minha idade é ${idade}`
// }

//console.log(nomeIdade("Rafa", 30))

function soma(numero1, numero2) {
    return numero1 + numero2;
}

function multiplica(numero1 = 1, numero2 = 1) {
    return numero1 * numero2;
}

console.log(multiplica(soma(4, 5)))

function comParametro(param) {
    console.log(param)
}
comParametro()