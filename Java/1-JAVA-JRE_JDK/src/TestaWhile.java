
public class TestaWhile {
	public static void main(String[] args) {
		System.out.println("Testando laço de repetição 'While'");

		int i = 0; // declarando a variavel 'i', precisa ter um valor de inicio
		while (i <= 10) { // enquanto o 'i' for <= que '10' faz o que ta dentro
			System.out.println(i); // imprimi o valor atual do 'i'
			i++; // acrescenta cada vez 1 ao 'i' 'i = i + 1' ou 'i += 1' tb serve
		}

		System.out.println(i); // mostrar em qual parou o 'cont'
	}
}