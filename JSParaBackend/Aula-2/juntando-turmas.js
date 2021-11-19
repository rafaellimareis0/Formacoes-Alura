const salaDePython = ['Melissa', ' Helena', ' Rodrigo']
const salaDeJS = [' Ju', ' Leo', ' Raquel']

const salasUnificadas = salaDePython.concat(salaDeJS)

console.log(`As salas unificadas contém os seguintes alunos ${salasUnificadas}`)

const salaDePython1 = salasUnificadas.slice(0, salasUnificadas.length / 2)
const salaDeJS1 = salasUnificadas.slice(salasUnificadas.length/2)

console.log(`Somente os alunos que vieram de Python são: ${salaDePython1}`)
console.log(`Somente os alunos que vieram de JavaScript são: ${salaDeJS1}`)

const salasUnificadas2 = salaDePython1.concat(salaDeJS1)

console.log(`E unificando as salas novamente fica assim: ${salasUnificadas2}`)