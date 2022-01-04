for (let i = 0; i < 10; i++) {
    console.log(i); // 1, 2, 3, 4 ... 9
}
console.log(i);  // a variável  i não está definida, pois o ela foi escrita com o "let" que restringe essa variável a existir somente dentro do escopo for

for (var i = 0; i < 10; i++) {
    console.log(i); // 1, 2, 3, 4 ... 9
}
console.log(i); //aqui temos a variável em escopo global assim sendo visível em todo o script isso resultaria em um i  = 10