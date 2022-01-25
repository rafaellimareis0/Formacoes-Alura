
public class Gerente extends FuncionarioAutenticavel { // classe 'gerente' herda os atributos da classe 'funcionario' pelo código
											// 'extends'

	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do GERENTE");
		return super.getSalario();
	}
}
