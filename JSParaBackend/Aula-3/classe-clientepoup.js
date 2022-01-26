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
        console.log(this.saldo)
    }
}
                        //herança
class ClientePoupanca extends Cliente{
    constructor(nome, email, cpf, saldo, saldoPoupanca){
        super(nome, email, cpf, saldo) //super serve para informar quais propriedades vai herdar
        this.saldoPoupanca = saldoPoupanca
    }
    depositarPoupanca(valor){
        this.saldoPoupanca += valor
    }
}

const rafael = new ClientePoupanca('Rafael', 'rafael@email.com', '11122233300', 100, 200)

//console.log(rafael)

//alterar vvalores
rafael.depositar(50)
rafael.depositarPoupanca(50)

console.log(rafael)