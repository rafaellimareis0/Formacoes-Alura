
public class Gerente extends Funcionario implements Autenticavel { // classe 'gerente' herda os atributos da classe
																	// 'funcionario' pelo código
	// 'extends'

	private AutenticacaoUtil autenticador;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);

	}
}