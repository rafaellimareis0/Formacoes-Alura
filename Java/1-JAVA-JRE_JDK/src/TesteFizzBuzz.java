/* Write a short program that prints each number from 1 to 100 on a new line.
* For each multiple of 3, print "Fizz" instead of the number. For each multiple
* of 5, print "Buzz" instead of the number. For numbers which are multiples of
* both 3 and 5, print "FizzBuzz" instead of the number.
*/

public class TesteFizzBuzz {
	public static void main(String[] args) {
		System.out.println("Teste FizzBuzz do HackerRank para IBM Associates Internship Program");

		for (int i = 0; i <= 15; i++) { // cria e inicializa o contador; add o limite ao contador e add + 1
			if (i % 3 == 0 && i % 5 == 0) { // condição para finalizar
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) { // contador dividido por 3 for exatamente igual a 0 imprime 'Fizz'
				System.out.println("Fizz");
			} else if (i % 5 == 0) { // contador dividido por 5 for exatamente igual a 0 imprime 'Buzz'
				System.out.println("Buzz");
			} else {
				System.out.println(i); // aqui só para imprimir o contador caso não tenha resultado nas divisoes acima
			}
		}
	}
}