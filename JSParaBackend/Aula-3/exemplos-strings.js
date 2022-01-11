//sobre strings e arrays
const fruta = "banana"
["b", "a", "n", "a", "n", "a"]

//formas de escrever strings
const frase = "Mergulhando em tecnologia com Alura";
const frase = ‘Mergulhando em tecnologia com Alura’;
console.log('Mergulhando em tecnologia com Alura')

//convertendo numeros em strings
const numero = 256
const convertidoEmString = new String(numero)
//outro metodo
const num = 500
console.log(num.toString()) //'500'

//concatenando strings
let nome = "André"
let sobreNome ="Silva"
let nomeCompleto = "Meu nome completo é : " + nome + sobreNome

let nome = "André"
let saudacoes = "Seja bem-vindo "
saudacoes += nome //Seja bem-vindo André

//Template strings
let nome = "André"
let saudacoes =`Seja bem-vindo ${nome}`

let nome = "André"
let poema = `
   E agora, ${nome}?
   A festa acabou,
   a luz apagou,
   o povo sumiu,
   a noite esfriou,
   e agora, ${nome}?
   e agora, você?
   você que é sem nome,
   que zomba dos outros,
   você que faz versos,
   que ama, protesta?
   e agora, ${nome}?`

//Metodos para strings
//.length
const palavra="alura";
console.log(palavra.length) //5
//.charAt()
console.log("alura".charAt(3)) //r
//array
const palavra="Alura"
console.log(palavra[0]) //A
//indexOf()
const palavra="Alura"
console.log(palavra.indexOf("a")) //4
//ou
const palavra="Divertidamente"
console.log(palavra.indexOf("e")) //3
//toUpperCase() e toLowerCase()
const palavra="alura";
console.log(palavra.toUpperCase()) //ALURA
console.log(palavra.toLowerCase()) //alura
//substr()
let frase= "Mergulhando em tecnologia."
console.log(frase.substr(0,11)) // Mergulhando
//slice()
let frase= "Mergulhando em tecnologia."
console.log(frase.slice(0,11)) // Mergulhando
//replace()
let nome = "André";
let comunicacao = " Olá, sr. nomeusurario, informamos que a partir da presente data o senhor tem 50% de desconto em nossa loja.";
console.log(comunicacao.replace("nomeusurario",nome));
//concat()
let novaString = "Programe nas principais linguagens e plataformas. Explore linguagens como ";
console.log(novaString.concat("JavaScript,").concat(" Python,").concat(" e C#."))
//split()
let linguagens = "JavaScript;Java;C#;PHP;Python;Go;Vb;SQL;C;C++";
let arrayLinguagens = linguagens.split(";");
console.log(arrayLinguagens) 
//resultado [ 'JavaScript',
// 'Java',
// 'C#',
// 'PHP',
// 'Python',
// 'Go',
// 'Vb',
// 'SQL',
// 'C',
// 'C++' ]

//trim()
let login = "   andre@emailteste.com      ";
let loginSemEspaco = login.trim();
console.log(loginSemEspaco); //andre@emailteste.com
