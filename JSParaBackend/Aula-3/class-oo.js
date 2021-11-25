class Pessoa {
    constructor(nome, sobrenome, cpf, email){
        this.nome = nome
        this.sobrenome = sobrenome
        this.cpf = cpf
        this.email = email
    }
    exibirNomeCompleto(){
        console.log(`${this.nome} ${this.sobrenome}`)
    }
}

//O Objeto é a instancia de uma classe
const novoDev = new Programador('Rafael', 'Lima', 'rafael@email.com')
console.log(novoDev)