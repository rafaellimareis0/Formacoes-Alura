
public class TesteReferencias {
	public static void main(String[] args) {
		System.out.println("2 - Aprendendo sobre referencias");
		
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira: " +primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta;
		System.out.println("Saldo da segunda: " +segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println("Saldo atualizado da segunda: " +segundaConta.saldo);
		
		System.out.println("Primeira conta: " + primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("Contas iguais");
		} else {
			System.out.println("Contas diferentes");
		}
		
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
	}
}
