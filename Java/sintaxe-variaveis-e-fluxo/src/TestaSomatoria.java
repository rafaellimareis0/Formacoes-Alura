
public class TestaSomatoria {
	public static void main(String[] args) {
		System.out.println("Testando contador no while");

		int i = 0; //declarando e iniciando o contador
		int t = 0; //declarando e iniciando o total
		while (i <= 10) { //enquanto o contador for menor que '10' continua dentro do laço
			t += i; //operação aritmetica utilizar 'total += contador' é o mesmo que 't = t + i'
			System.out.println(i); //mostrar o contador mudando
			System.out.println(t); //mostrar o total adicionando ao ultimo contador
			i++; //adicionar no contador 'i' + 1
		}
		System.out.println(t);
	}
}
