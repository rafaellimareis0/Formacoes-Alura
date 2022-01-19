public class Conta { // classe 'Conta'
	double saldo; // atributo da classe 'Conta'
	int agencia; // atributo da classe 'Conta'
	int conta; // atributo da classe 'Conta'
	String titular; // atributo da classe 'Conta'

	// este é o método deposita
	void deposita(double valor) { // criando método para a classe 'Conta'; tipo de variável 'double' e nome
									// 'valor'
		this.saldo += valor; // 'this' é utilizado para especificar que é para aquela conta; 'saldo' é o
								// atributo; adiciona 'valor' ao atributo 'saldo'
	}

	// este é o método saca
	public boolean saca(double valor) { // criar a variavel 'saca' sendo boolean porque vai ser verificado se é verdade
										// que tem dinheiro dentro do 'if' a seguir; e cria a váriavel 'valor' porque é
										// o que vai ser digitado para sacar aquele valor especifico da conta se tiver o
										// dinheiro lá
		if (this.saldo >= valor) { // 'this' para mostrar que é deste objeto conta, e valor é o que quer sacar
			this.saldo -= valor; // 'this' para mostrar que é desta conta, e 'saldo' para saber qual atributo;
									// 'valor' é o que vai sacar
			return true; // 'return' para parar a execução do método e true se for verdade esse 'if'
		} else {
			return false;
		}
	}

	// este é o método de transfere
	public boolean transfere(double valor, Conta destino) { // criar um boolean pra saber se tem o dinheiro suficiente
															// para transferir, variavel 'valor' que é onde vai digitar
															// o valor da transferencia e variavel 'destino' que é do
															// objeto 'Conta'
		if (this.saldo >= valor) { //se 'if' saldo desta 'this' conta for >= 'valor' digitado
			this.saldo -= valor; //saldo desta conta retira o valor digitado
			destino.deposita(valor); //e adiciona na conta de 'destino' utilizando o método deposita
			return true;
		} else {
			return false;
		}
	}
}