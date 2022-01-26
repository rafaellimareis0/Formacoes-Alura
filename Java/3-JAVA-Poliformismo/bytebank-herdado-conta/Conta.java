

public class Conta { // classe 'Conta'
	private double getSaldo; // atributo da classe 'Conta'
	private int agencia; // atributo da classe 'Conta'
	private int numero; // atributo da classe 'Conta'
	private Clientes titular; // atributo da classe 'Conta'
	public double saldo;
	private static int total; //utiliza o static para mostrar que isso é da classe e não da conta especifica
	
	//esse é o construtor padrão da classe Conta
	public Conta(int agencia, int numero) { //isso é para forçar a colocar os atributos obrigatorios na criação do objeto
		Conta.total++;
		System.out.println("O total de contas é: " + total);
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("Estou criando uma conta " + this.numero);
	}
	
	
	// este é o método deposita
	void deposita(double valor) { // criando método para a classe 'Conta'; tipo de variável 'double' e nome
									// 'valor'
		this.getSaldo += valor; // 'this' é utilizado para especificar que é para aquela conta; 'saldo' é o
								// atributo; adiciona 'valor' ao atributo 'saldo'
	}

	// este é o método saca
	public boolean saca(double valor) { // criar a variavel 'saca' sendo boolean porque vai ser verificado se é verdade
										// que tem dinheiro dentro do 'if' a seguir; e cria a váriavel 'valor' porque é
										// o que vai ser digitado para sacar aquele valor especifico da conta se tiver o
										// dinheiro lá
		if (this.getSaldo >= valor) { // 'this' para mostrar que é deste objeto conta, e valor é o que quer sacar
			this.getSaldo -= valor; // 'this' para mostrar que é desta conta, e 'saldo' para saber qual atributo;
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
		if (this.getSaldo >= valor) { //se 'if' saldo desta 'this' conta for >= 'valor' digitado
			this.getSaldo -= valor; //saldo desta conta retira o valor digitado
			destino.deposita(valor); //e adiciona na conta de 'destino' utilizando o método deposita
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() { //o saldo esta 'private' então precisa criar esse método para mostrar o saldo
		return this.getSaldo; //retorna o 'this' . 'saldo' quando puxar este método
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		if (numero <= 1) {
			System.out.println("Não pode valor menor que 1");
			return;
		}
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		if (agencia <= 1) {
			System.out.println("Não pode valor menor que 1");
			return;
		}
		this.agencia = agencia;
	}
	
	public void setTitular(Clientes titular) {
		this.titular = titular;
	}
	public Clientes getTitular() {
		return titular;
	}
	public static int getTotal() {
		return Conta.total;
	}
}