
public class TesteGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Thais"); // este atributo nome esta setado na classe do funcionario e o gerente herdou
								// desta classe
		g1.setCpf("888999777-44"); // este atributo nome esta setado na classe do funcionario e o gerente herdou
									// desta classe
		g1.setSalario(5000.0); // este atributo nome esta setado na classe do funcionario e o gerente herdou
								// desta classe

		System.out.println("O nome do gerente é " + g1.getNome());
		System.out.println("O CPF do gerente é " + g1.getCpf());
		System.out.println("E o salario do gerente é de " + g1.getSalario());

		g1.setSenha(2222); // setando a senha especifica da classe gerente

		boolean autenticou = g1.autentica(2222);
		System.out.println("Gerente autenticou a senha? " +autenticou);
		
		System.out.println("Valor da bonificação do gerente "+g1.getBonificacao());

	}

}
