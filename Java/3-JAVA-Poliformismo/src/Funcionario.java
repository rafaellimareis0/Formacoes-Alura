//Aprendendo sobre herança. Essa é a criação de classe.

public class Funcionario { // classe funcionario

	private String nome; // atributo da classe
	private String cpf; // atributo da classe
	private double salario; // atributo protected é visivel somente para os 'extended' que são os filhos desta classe mae

	/* Criando o construtor, serve para obrigar a usar o que ta dentro das () na hora de criar o objeto Funcionario
	o construtor padrão é aquele que não tem nenhum parâmetro. 
	um construtor é chamado na inicialização/criação do objeto. */
	public Funcionario() {
	}

	public double getBonificacao() { // metodo publico para bonificação do salario
		return this.salario * 0.05; // retorna 'deste' objeto o 'salario'; este calculo é para calcular salario * 10%
	}

	/* get e set feito pelo menu Source>Generate Getters and Setters; ele pega os
	atributos e geram automatico como publico */
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
