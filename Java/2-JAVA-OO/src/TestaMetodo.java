/* O objetivo de métodos, definir o que um objeto sabe fazer. 
 O comportamento é implementado dentro do método.
 um método pode ter nenhum, um ou mais parâmetros
 Repare que todos os nomes começam com letra minúscula e depois usam "CamelCase" 
 Para chamar um método: sempre usando nomeDaReferencia.nomeDoMetodo();
 O uso do this é opcional, mas recomendamos o seu uso, principalmente para o iniciante na linguagem Java. */

public class TestaMetodo {
	public static void main(String[] args) {
		System.out.println("3 - Aprendendo a invocar metodos da classe");

		Conta contaDoRafa = new Conta(); // classe 'Conta' e variavel 'conta' e o 'new' 'Conta' para criar na classe
		contaDoRafa.saldo = 100; // saldo inicial
		System.out.println("Saldo inicial conta do Rafa: " + contaDoRafa.saldo);
		contaDoRafa.deposita(50); // invocar o método 'deposita' dentro da 'contaDoRafa'; depositando na conta
		System.out.println("Saldo atualizado com deposito conta do Rafa: " + contaDoRafa.saldo);
		contaDoRafa.saca(25); // invocar o método 'saca' dentro da contaDoRafa; sacando valor
		System.out.println("Saldo atualizado após saque conta do Rafa " + contaDoRafa.saldo); // mostrando valor
																								// atualizado depois do
																								// saque

		Conta contaDaThais = new Conta(); // cria uma conta
		contaDaThais.saldo = 1000; // deposita saldo nesta conta
		System.out.println("Saldo inicial da conta da Thais: " + contaDaThais.saldo); // mostrar saldo
		boolean sucesso = contaDaThais.transfere(300, contaDoRafa); // cria um boolean para o if chamado sucesso, e se
																	// na conta da thais tiver o valor solicitado para a
																	// transferencia, então transfere para conta do rafa
																	// com o método transfere
		if (sucesso) { // se o boolean 'sucesso' for verdadeiro
			System.out.println("Transferencia efetuada com sucesso");
		} else { // se o boolean 'sucesso' for falso
			System.out.println("Transferencia não realizada, saldo insuficiente");
		}
		System.out.println("Conta da Thais depois da transferencia: " + contaDaThais.saldo); // mostrar saldo da conta
		System.out.println("Conta do Rafa depois da transferencia: " + contaDoRafa.saldo); // mostrar saldo da conta
	}
}
