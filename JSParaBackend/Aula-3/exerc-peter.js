const personagem = {
    nome: 'Peter Parker',
    heroi: 'Homem-Aranha',
    idade: 16,
    sextetoSinistro: [{
        vilaoUm: 'Homem-Areia',
        vilaoDois: 'Kraven',
        vilaoTres: 'Electro',
        vilaoQuatro: 'Doutor Octopus',
        vilaoCinco: 'Mystério',
        vilaoSeis: 'Abutre'
    }]
}

console.log(personagem)

const vilao = personagem.sextetoSinistro.filter(sextetoSinistro => sextetoSinistro.vilaoQuatro === 'Doutor Octopus')

console.log(`O quarto vilão do Sexteto Sinistro é o ${vilao[0].vilaoQuatro}.`)


//erro final dando "object Object"
// console.log(`Meu personagem escolhido é o ${personagem.heroi}, seu verdadeiro nome é ${personagem.nome} e ele tem ${personagem.idade}. Seus maiores vilões fazem parte do Sexteto Sinistro, e são eles ${personagem.sextetoSinistro}.`)