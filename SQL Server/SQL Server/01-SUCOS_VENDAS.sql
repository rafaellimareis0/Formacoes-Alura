--Comando para criar a tabela dentro do banco de dados 'SUCOS_VENDAS'
CREATE TABLE [TABELA DE CLIENTES]

--Comando para criar o campo do CPF com tipo CHAR(porque todo CPF tem um numero fixo de caracteres e nao exclui o '0' do inicio e 11 caracteres
([CPF] [CHAR] (11),
--Comando para criar o campo do nome com tipo VARCHAR(se nao usar todos os caracteres n�o ocupa espa�o na memoria) e 100 caracteres
[NOME] [VARCHAR] (100),
--Comando para criar o campo de endere�o com tipo VARCHAR e 150 caracteres
[ENDERECO1] [VARCHAR] (150),
--Comando para criar o campo de endere�o com tipo VARCHAR e 150 caracteres
[ENDERECO2] [VARCHAR] (150),
--Comando para criar o campo do bairro com tipo VARCHAR e 50 caracteres
[BAIRRO] [VARCHAR] (50),
--Comando para criar o campo do cidade com tipo VARCHAR e 50 caracteres
[CIDADE] [VARCHAR] (50),
--Comando para criar o campo do estado com tipo char e 2 caracteres
[ESTADO] [CHAR] (2),
--Comando para criar o campo do CEP com tipo char e 8 caracteres
[CEP] [CHAR] (8),
--Comando para criar o campo da data de nascimento com tipo DATE
[DATA DE NASCIMENTO] [DATE],
--Comando para criar o campo da idade com tipo SMALLINT
[IDADE] [SMALLINT],
--Comando para criar o campo do sexo com tipo char e 1 caracter
[SEXO] [CHAR] (1),
--Comando para criar o campo do dinheiro com tipo MONEY
[LIMITE DE CREDITO] [MONEY],
--Comando para criar o campo do volume de compra com tipo FLOAT porque pode ter decimal
[VOLUME DE COMPRA] [FLOAT],
--Comando para criar o campo se fez a primeira compra ou n�o com tipo BIT, 1 ou 0, verdadeiro ou falso
[PRIMEIRA COMPRA] [BIT])

CREATE TABLE [TABELA DE VENDEDORES]
([MATRICULA] [CHAR] (5),
[NOME] [VARCHAR] (100),
[PERCENTUAL COMISSAO] FLOAT);