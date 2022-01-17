
public class TestaCondicional {
	public static void main(String[] args) {
		System.out.println("Começando com condicionais IF");

		int idade = 17; // declarando a variavel
		boolean acompanhado = true;
		int acompanhante = 17;

		if (idade >= 18) { // condição para entrar no IF
			System.out.println("Maior de idade"); // mostrar na tela
			// System.out.println("Seja bem vindo"); //mostrar na tela
		} else { // caso não de certo vem para essa
			if (acompanhado == true && acompanhante >= 18) { // condição dentro da condição
				System.out.println("Você está acompanhado, então pode entrar!");
				System.out.println("Seja bem vindo!!");
			} else {
				System.out.println("Menor de idade"); // mostrar na tela
				System.out.println("Você não pode entrar"); // mostrar na tela
			}
		}
	}
}
