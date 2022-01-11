//aqui define as chaves do objeto
function Cliente(nome, cpf, email, saldo){
    this.nome = nome
    this.cpf = cpf
    this.email = email
    this.saldo = saldo
    this.depositar = function(valor){ //essa funcao define o aumento de saldo utilizando a funcao depois
        this.saldo += valor
    }
}

function ClientePoupanca(nome, cpf, email, saldo, saldoPoup){
    Cliente.call(this, nome, cpf, email, saldo)
    this.saldoPoup = saldoPoup
}

//aqui é para chamar o objeto do cliente
const rafael = new ClientePoupanca('Rafael', '11122233344', 'rafa@email.com', 1000, 2000)

//console.log(rafael)


//aqui define a alteração de valor do saldo da poupança
ClientePoupanca.prototype.depositarPoup = function(valor){
    this.saldoPoup += valor
}

rafael.depositarPoup(500)
console.log(rafael.saldoPoup)