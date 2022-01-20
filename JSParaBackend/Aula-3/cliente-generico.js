//isso cria as chaves de forma generica
function Cliente(nome, cpf, email, saldo){
    this.nome = nome
    this.cpf = cpf
    this.email = email
    this.saldo = saldo
    this.depositar = function(valor){
        this.saldo += valor
    }
}

//aqui voce cria a constante e chama com os dados dentro do objeto 'Cliente'
const rafael = new Cliente('Rafael', '11122233344', 'rafael@email.com', '1000')

console.log(rafael)