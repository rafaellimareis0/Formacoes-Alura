class Cliente{
    constructor(nome, email, cpf, saldo){
        this.nome = nome
        this.email = email
        this.cpf = cpf
        this.saldo = saldo
    }
    depositar(valor){
        this.saldo += valor
    }
    exibirSaldo(){
        console.log(${this.saldo})
    }
}

const rafael = new Cliente('Rafael', 'rafael@email.com', '11122233300', 1000)
console.log(rafael)