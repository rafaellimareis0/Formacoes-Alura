
public class TestaLacos2 {
	public static void main(String[] args) {
		System.out.println("Testando novos laços encadeados");

		for (int linha = 1; linha < 10; linha++) { // criando e inicializando contador da linha
			for (int coluna = 1; coluna < 10; coluna++) { // criando e inicializando contador da coluna
				if (coluna > linha) { // se a coluna for maior que a linha não vai imprimir o asterisco
					break; // comando para sair do 'if' toda vez que a coluna for maior que a linha e
							// imprimir o asterisco correspondente da coluna igual a linha
				}
				System.out.print("*");
			}
			System.out.println();
		}

		// mesmo laço que o de cima só que resumido, sem o 'if'
		for (int linha = 1; linha < 10; linha++) { // criando e inicializando o contador da linha
			for (int coluna = 1; coluna < linha; coluna++) { // criando e inicializando o contador da coluna, e caso a
																// coluna seja menor que a linha soma 1 na coluna
				System.out.print("*");// imprime 1 asterisco para cada vez que a coluna for menor que a linha
			}
			System.out.println(); // só para quebrar a linha de cada vez que a coluna for impressa
		}

		// mesmo laço que acima só que utilizando números
		for (int linha = 0; linha <= 5; linha++) { // criando e iniciando a linha
			for (int coluna = 1; coluna <= 5; coluna++) { // criando e iniciando a coluna
				if (coluna > linha) { // caso a coluna seja maior que a linha não vai imprimir nada
					break; // comando para parar sair do laço 'if'
				}
				System.out.print(coluna); // imprimir o valor da coluna atual
			}
			System.out.println(); // quebrar a linha
		}
	}
}