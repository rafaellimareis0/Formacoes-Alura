const objPersonagem = {
    nome: "Gandalf",
    classe: "mago",
    nivel: "20",
    aliado: {
      nome: "Saruman",
      classe: "mago"
    },
    status: "desaparecido"
   }

   const mago = ["nome", "classe", "nivel", "aliado", "status"]

   mago.forEach(info => console.log(objPersonagem[info]))