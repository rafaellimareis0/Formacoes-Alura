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
//a função serve para depois e procura a chave dentro do objeto 'obj' que equivale ao cliente
//criada a função propsClientes = object.keys(obj)

function oferecerSeguro(obj){
    const propsClientes = Object.keys(obj); //isso já é um array
    if(propsClientes.includes('dependentes')) //includes verifica se tem o dado 'dependentes' que eu pedi na chave do propsClientes{
        console.log(`Oferta de seguro de vida para ${obj.nome}`); //criado 'obj' que é o objeto do cliente
    }


oferecerSeguro(cliente) //chama função para exibir, direcionado ao objeto que é o cliente

console.log(Object.keys(cliente)) //esse serve para chamar as chaves
console.log(Object.values(cliente)) //esse serve para chamar os valores dentro das chaves
console.log(Object.entries(cliente)) //esse serve para chamar todos os dados