/* Aprendendo sobre herança. Essa é a criação de classe.
 * A classe Gerente herdará todo o comportamento da classe Funcionario.
 * Isto é, todos os métodos públicos podem ser utilizados na classe Gerente também.
 * A classe Gerente herda todas as características da classe Funcionario.
 * Todos os atributos também fazem parte do Gerente.
 * Ao estender a classe Funcionario se diz que o Gerente é um Funcionario.
 
 * A palavra chave com a menor visibilidade é private, depois vem o protected e depois public.
 * private - apenas visível dentro da classe
 * protected - visível dentro da classe e também para as filhas
 * public - visível em todo lugar
 * Repare também que protected é relacionado com a herança.
 
  Explicando:
     * O parâmetro que estou recebendo é uma variável que carrega a referência que pode ser para um objeto do tipo Funcionario
     * Entretanto, qualquer referência para um objeto que herda de Funcionario poderá ser passado para este método
     * Seja uma referência para um objeto do tipo: Gerente, EditorDeVideo, Funcionario 
     * Isso acontece porque todo Gerente, EditorDeVideo é oriundo de Funcionario
     * Mas nem todo Gerente é oriundo de EditorDeViode ou vice versa
     * por isso, passamos a referência mais genérica possível para o método*/
 

public class Gerente extends Funcionario { // classe 'gerente' herda os atributos da classe 'funcionario' pelo código
											// 'extends'

	private int senha; // atributo da classe

	public Gerente() {
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// isso se chama reescrita, porque tem o mesmo método na classe Funcionario
	public double getBonificacao() { // metodo publico para bonificação do salario
		return super.getBonificacao() + super.getSalario(); // 'super' é para pegar tudo que esta na classe acima, no caso a
														// classe mae que é a classe Funcionario. 'super.getBonificacao'
														// pega o atributo da classe acima, e o 'super.getSalario' para pegar
														// o metodo da classe acima
	}
}
