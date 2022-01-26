
public class TesteGetESet {
	public static void main(String[] args) {
		Conta conta = new Conta(1234, 4321);
		System.out.println(conta.getNumero());

		Cliente rafael = new Cliente();
		rafael.setNome("Rafael Lima");
		conta.setTitular(rafael); // isso é para concatenar os 2 objetos e mostrar que o titular do objeto 'conta'
									// é o nome 'rafael' do objeto 'cliente'
		
		System.out.println(conta.getTitular().getNome()); //exibe o nome do titular da conta
		
		conta.getTitular().setProfissao("desenvolvedor"); //para alterar a profissao do titular da conta
	}
}
