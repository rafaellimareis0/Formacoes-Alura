
public class CriaConta {
	public static void main(String[] args) {
		System.out.println("1 - Aprendendo a criar objetos");

		Conta primeiraConta = new Conta(); // tipo de variavel: 'Conta'; nome da var: 'primeiraConta'; 'new' para criar
											// a conta; 'Conta' é a classe
		primeiraConta.saldo = 200; // 'primeiraConta' é a variavel onde vai ter todas as informações como 'saldo'
									// nesse caso
		System.out.println(primeiraConta.saldo); // mostrar um atributo da 'primeiraConta'
	}
}
