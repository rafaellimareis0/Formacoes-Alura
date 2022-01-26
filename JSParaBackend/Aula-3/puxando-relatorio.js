const cliente = {
    nome: 'Rafael',
    idade: 30,
    cpf: '11122233300',
    email: 'rafael@email.com',
    fones: ['5511988887777', '551122223333'],
    dependentes: [{
        nome: 'Thais Carvalho',
        parentesco: 'Esposa',
        dataDeNasc: '18/05/1992'},
    {
        nome: 'Josefa Soares',
        parentesco: 'Mãe',
        dataDeNasc: '08/09/1961'}],
    saldo: 100,
    depositar:function(valor){
        this.saldo += valor
    }
}

cliente.depositar(100)
//console.log(cliente.saldo)

let relatorio = '';
for (let info in cliente){
    if(typeof cliente[info] === 'object' || typeof cliente[info] === 'function'){
        continue
    } else {
        relatorio += `
        ${info} ===> ${cliente[info]}
        `
    }
}

console.log(relatorio)