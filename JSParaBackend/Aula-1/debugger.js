const express = require('express')

const app = express()

app.get('/', (req,res) => {

  const dadoExterno = req.query.dadoExterno

  const valorDoResponse = `Você me enviou: ${dadoExterno}`

  res.send(valorDoResponse)
})

const port = 3000

app.listen(port, () => {

  console.log(`

  Servidor subiu com sucessinhos!

  htttp://localhost:${port}

  `)
})