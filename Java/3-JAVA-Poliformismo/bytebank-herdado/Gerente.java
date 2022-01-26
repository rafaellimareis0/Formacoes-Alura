
public class Gerente extends Funcionario implements Autenticavel { // classe 'gerente' herda os atributos da classe
																	// 'funcionario' pelo código
	// 'extends'

	private int senha;

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;

	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}