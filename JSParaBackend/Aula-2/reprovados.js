const nomes = ['Ana', 'Marcos', 'Maria', 'Mauro']
const notas = [7, 4.5, 8, 7.5]
                                //parametros do metodo filter
const reprovados = nomes.filter((_, indice) => notas[indice] < 5)
console.log(`Reprovados: ${reprovados}`)