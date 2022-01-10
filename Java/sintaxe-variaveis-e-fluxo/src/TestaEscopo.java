
public class TestaEscopo {
	public static void main(String[] args) {
		System.out.println("Parte 2 com condicionais IF");

		int idade = 16;
		int quantidadePessoas = 3;
		// boolean acompanhado = quantidadePessoas >= 2;

		boolean acompanhado; // declarando variavel

		if (quantidadePessoas >= 2) { // condição
			acompanhado = true;
		} else {
			acompanhado = false;
		}

		if (idade >= 18 && acompanhado) { // condição
			System.out.println("Seja bem vindo");
		} else {
			System.out.println("infelizmente voce nao pode entrar");
		}

	}
}