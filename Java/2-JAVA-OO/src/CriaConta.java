
public class CriaConta {
	public static void main(String[] args) {
		System.out.println("1 - Aprendendo a criar objetos e atributos para os objetos");

		// O tipo de variável conta vem do outro arquivo chamado 'Conta.java' porque lá
		// tem a declaração de variáveis onde tem o 'saldo', 'agencia', conta', 'nome',
		// então da para puxar qualquer atributo desse arquivo

		Conta primeiraConta = new Conta(); // tipo de variavel: 'Conta'; nome da var: 'primeiraConta'; 'new' para criar
											// a conta; 'Conta' é a classe
		primeiraConta.saldo = 200; // 'primeiraConta' é a variavel onde vai ter todas as informações como 'saldo'
									// nesse caso
		// System.out.println(primeiraConta.saldo); // mostrar um atributo da
		// 'primeiraConta'
		primeiraConta.saldo += 100; // adiciona o saldo '100' a 'primeiraConta' no atributo 'saldo'
		// System.out.println(primeiraConta.saldo); // imprime na tela o atributo
		// 'saldo' do objeto 'primeiraConta'

		Conta segundaConta = new Conta(); // cria uma variavel do tipo 'Conta' com o objeto 'segundaConta' e cria uma
											// nova 'Conta'
		segundaConta.saldo = 50; // adiciona um valor no atributo 'saldo' do objeto 'segundaConta'

		System.out.println("O saldo da primeira conta é de: " + primeiraConta.saldo);
		System.out.println("O saldo da segunda conta é de: " + segundaConta.saldo);

		primeiraConta.agencia = 2554; // alterando o valor do atributo 'agencia' que ta zerado la no arquivo
										// 'Conta.java'
		System.out.println("A agência da primeira conta é: " + primeiraConta.agencia); // puxando atributo da
																						// 'primeiraConta' chamado
																						// 'agencia'
		segundaConta.agencia = 1784; // alterando o valor do atributo 'agencia' que ta zerado la no arquivo
										// 'Conta.java'
		System.out.println("A agência da segunda conta é: " + segundaConta.agencia); // puxando atributo da
																						// 'segundaConta' chamado
																						// 'agencia'
		primeiraConta.conta = 01025; // alterando o valor do atributo 'conta' que ta zerado la no arquivo
										// 'Conta.java'
		System.out.println("A conta da primeira é: " + primeiraConta.conta); // puxando atributo da 'primeiraConta'
																				// chamado 'conta'
		segundaConta.conta = 01077;

		System.out.println("A conta da segunda é: " + segundaConta.conta); // puxando atributo da 'segundaConta' chamado
																			// 'conta'
		primeiraConta.titular = "Rafael";
		segundaConta.titular = "Thais";
		System.out.println("Segue os dados da primeira conta. Agência " + primeiraConta.agencia + ", conta-corrente: "
				+ primeiraConta.conta + " , o títular " + primeiraConta.titular + " e o saldo da conta: "
				+ primeiraConta.saldo);
		System.out.println("Segue os dados da segunda conta. Agência " + segundaConta.agencia + ", conta-corrente: "
				+ segundaConta.conta + " , o títular " + segundaConta.titular + " e o saldo da conta: "
				+ segundaConta.saldo);
		
		if (primeiraConta == segundaConta) {
			System.out.println("Mesma conta");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
