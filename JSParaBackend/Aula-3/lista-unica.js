const clientes = [{
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
        },
        {
        nome: 'Gandalf',
        idade: 80,
        cpf: '99988877766',
        email: 'gandalfocinzento@terramedia.com',
        fones: '5511933334444',
        dependentes: [{
            nome: 'Bilbo Bolseiro',
            parentesco: 'Companion 1',
            dataDeNasc: '01/01/1950'},
            {
            nome: 'Frodo Bolseiro',
            parentesco: 'Companion 2',
            dataDeNasc: '01/01/2000'}]
        }
]

// criado a const listaDependentes para criar um novo array, procura no clientes [0] os dependentes e no clientes[1] os dependentes para criar a nova lista
const listaDependentes = [...clientes[0].dependentes,...clientes[1].dependentes]

//para exibir a lista nova - utilizar console.table para mostrar como tabela
console.table(listaDependentes)