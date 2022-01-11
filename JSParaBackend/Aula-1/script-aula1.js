//var

var altura = 5;
var comprimento = 7;

area = altura * comprimento;
console.log(area)

//let 
let forma = "retangulo"
let alturaLet = 5;
let comprimentoLet = 7;
let areaLet;

if (forma === "retangulo") {
    areaLet = alturaLet * comprimentoLet;
} else {
    areaLet = (alturaLet * comprimento) / 2;
}
console.log(areaLet)

//const
const formaConst = "quadrado";
const alturaConst = 5;
const comprimentoConst = 7;
let areaConst;
if (formaConst === "quadrado") {
    areaConst = alturaConst * comprimentoConst;
} else {
    areaConst = (alturaConst * comprimentoConst) / 2;
}

console.log(areaConst)