const cliente = {
    nome: "Rafael",
    idade: "30",
    cpf: "99999999999",
    email: "rafael@email.com",
    fones: ["11988887777", "1122225555"]
}

cliente.dependentes = {
    nome: "Thais",
    parentesco: "Cônjuge",
    dataDeNasc: "18/05/1992"
}

console.log(cliente)

cliente.dependentes.nome = "Thais Carvalho"

console.log(cliente)