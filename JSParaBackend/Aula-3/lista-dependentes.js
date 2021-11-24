const cliente = {
    nome: 'Rafael',
    idade: 30,
    cpf: '11122233300',
    email: 'rafael@email.com',
    fones: ['5511988887777', '551122223333'],
    dependentes: [{
        nome: 'Thais Carvalho',
        parentesco: 'Esposa',
        dataDeNasc: '18/05/1992'
    }]
}

console.log(cliente)

cliente.dependentes.push({
    nome: 'Josefa Soares',
    parentesco: 'Mãe',
    dataDeNasc: '08/09/1961'
})

console.log(cliente)

const parente = cliente.dependentes.filter(dependente => dependente.parentesco === 'Esposa')


console.log(parente)
console.log(parente[0].nome)