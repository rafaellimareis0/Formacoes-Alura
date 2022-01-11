const fichaGuerreiro = {
    nome: "Aragorn",
    classe: "guerreiro"
   }
   
   const equipoGuerreiro = {
    espada: "Andúril",
    capa: "capa élfica +2"
   }

//const guerreiro = { fichaGuerreiro, equipoGuerreiro }
//console.log(guerreiro)


//adicionando a sintaxe de três pontos (reticências) antes do nome de cada objeto literal, com cada objeto separado por vírgula:
const guerreiro = { ...fichaGuerreiro, ...equipoGuerreiro }
console.log(guerreiro)