
public class TestaPontoFlutuante {
	public static void main(String[] Args) {
		System.out.println("Aprendendo sobre tipo de variavel com ponto flutuante");

		double salario; // variavel tipo double serve para valores com casas decimais
		salario = 1250.70;
		System.out.println("O meu salário é de R$" + salario);

		double divisao = 3.14 / 2;
		System.out.println("Resultado da divisao de PI: " + divisao);

		int outraDivisao = 5 / 2;
		System.out.println(outraDivisao);

		double divisaoComDouble = 5 / 2; // resultado é 2
		System.out.println(divisaoComDouble);

		double divisaoComDoubleFlutuante = 5.0 / 2; // resultado é 2.5, para isso tem que usar o ponto flutuante em um
													// dos caracteres
		System.out.println(divisaoComDoubleFlutuante);
		
		//testando a divisao de 2 variaveis na impressao
		double brindes = 15;
		double pessoas = 2;
		System.out.println(brindes / pessoas);
	
	}
}
