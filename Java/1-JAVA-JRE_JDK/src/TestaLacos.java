
public class TestaLacos {
	public static void main(String[] args) {
		System.out.println("Aprendendo sobre laços encadeados fazendo tabuada");

		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) { // criando e iniciando a variavel que vai
																			// ser a base da multiplicação da tabuada
			for (int contador = 1; contador <= 10; contador++) { // criando e iniciando a base da tabuada
				System.out.print(multiplicador * contador); // print na tela da tabuada sem 'ln' para manter sem quebrar
															// linha cada vez que imprimir
				System.out.print(" "); //para dar um espaço em cada numero impresso
			}
			System.out.println(" "); //aqui para dar um quebra de linha para tabuada
		}
	}
}