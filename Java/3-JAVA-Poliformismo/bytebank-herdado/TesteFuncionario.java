//Utilizando o objeto Funcionario

public class TesteFuncionario {

	public static void main(String[] args) {
		
		//Funcionario cliente = new Cliente();
		
		
		Gerente rafael = new Gerente(); //Criar o objeto 'rafael' do tipo 'Funcionario' que está descrito no arquivo 'Funcionario'
		rafael.setNome("Rafael Lima"); //chamando o objeto 'rafael' e setando um nome para ele através do 'set'
		rafael.setCpf("222333444-55"); //mesma coisa acima
		rafael.setSalario(2600.00);    //mesma coisa acima
		
		System.out.println(rafael.getNome()); //imprimindo o objeto 'rafael' depois de setar o nome e chamando pelo 'get'
		System.out.println(rafael.getBonificacao()); //imprimindo a bonificação depois de setar o salario, bonificação é um calculo
	}
}
