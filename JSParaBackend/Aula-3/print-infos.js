const cliente = {
    nome: "Rafael",
    idade: 30,
    cpf: "99999999999",
    email: "rafael@email.com"
}

console.log(`Meu nome é ${cliente.nome}, tenho ${cliente.idade} anos, meu CPF inicia com ${cliente.cpf.substring(0,3)} e o meu email é ${cliente.email}.`)
