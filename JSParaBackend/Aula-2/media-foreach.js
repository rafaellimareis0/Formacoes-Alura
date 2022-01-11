const notas = [10, 6.5, 8, 7.5]

let somaDasNotas = 0;

//com arrow function
// notas.forEach(nota => {
//     soma DasNotas += nota
// })

//sem arrow function
notas.forEach(function(nota){
    somaDasNotas += nota
})

let media = somaDasNotas / notas.length;

console.log(`A media das notas é ${media}`)