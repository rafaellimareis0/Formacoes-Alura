//sem utilizar o this()
// const pessoa = {
//     nome: "Ana",
//     email: "a@email.com",
//     imprimeNome: function(){
//       console.log(`${pessoa.nome}`)
//     }
//    }
   
// pessoa.imprimeNome() //Ana

//utilizando o this()
// const pessoa = {
//     nome: "Ana",
//     email: "a@email.com",
//     imprimeNome: function(){
//       console.log(`${this.nome}, ${this.email}`)
//     }
// }
   
// pessoa.imprimeNome() //Ana

//utilizando o this() para mais de um objeto
const pessoa1 = {
    nome: "Ana",
    email: "a@email.com",
    imprimeInfo: imprimeNomeEmail
   }
   
   const pessoa2 = {
    nome: "Paula",
    email: "p@email.com",
    imprimeInfo: imprimeNomeEmail
   }
   
   pessoa1.imprimeInfo()
   //nome: Ana, email a@email.com
   pessoa2.imprimeInfo()
   //nome: Paula, email p@email.com


   function Pessoa(nome, email){
    this.nome =nome
    this.email =email
    this.imprimeNomeEmail = function(){
        console.log(`nome: ${this.nome}, email: ${this.email}`)
    }
   }
//usando o metodo call
   function imprimeNomeEmail(tipoCliente){
    console.log(`${tipoCliente} - nome: ${this.nome}, email: ${this.email}`)
   }
   
   const cliente1 = {
    nome: "Carlos",
    email: "c@email.com"
   }
   
   const cliente2 = {
    nome: "Fred",
    email: "f@email.com"
   }

   imprimeNomeEmail.call(cliente1, "cliente especial")
   // cliente especial - nome: Carlos, email: c@email.com
   
   imprimeNomeEmail.call(cliente2, "cliente estudante")
   // cliente estudante - nome: Fred, email: f@email.com

//utilizando o métoddo apply
function imprimeNomeEmail(tipoCliente, agencia){
    console.log(`
      ${tipoCliente} da agência ${agencia}:
      - nome: ${this.nome}, email: ${this.email}
      `)
   }
   
   const cliente1 = {
    nome: "Carlos",
    email: "c@email.com"
   }
   
   const cliente2 = {
    nome: "Fred",
    email: "f@email.com"
   }

   const clienteEspecial = ["cliente especial", "Rio de Janeiro"]
   const clienteEstudante = ["cliente estudante", "Fortaleza"]
   
   imprimeNomeEmail.apply(cliente1, clienteEspecial)
   // cliente especial da agência Rio de Janeiro: - nome: Carlos, email: c@email.com
   
   imprimeNomeEmail.apply(cliente2, clienteEstudante)
   // cliente estudante da agência Fortaleza: - nome: Fred, email: f@email.com

//utilizando o metodo blind()
const personagem = {
    nome: "Princesa Leia",
    apresentar: function(){
      return `a personagem é ${this.nome}`
    }
   }

   const personagemGenerico = personagem.apresentar
   console.log(personagemGenerico())
   //a personagem é undefined

   for (let i = 0; i < palavrasSimples.length; i++) {
     const element = palavrasSimples[i];
     
   }