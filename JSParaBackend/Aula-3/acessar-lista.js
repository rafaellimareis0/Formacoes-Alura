const cliente = {
    nome: "Rafael",
    idade: 30,
    cpf: "99999999999",
    email: "rafael@email.com",
    conta: 12345-5
}

const chaves = ["nome", "idade", "cpf", "email", "conta"]

chaves.forEach(info => console.log(cliente[info]))