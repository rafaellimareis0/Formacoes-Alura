
public class DesafioMultiplosDe3 {
	public static void main(String[] args) {
		System.out.println("Desafio das aulas para imprimir os multiplos de 3 utilizando 'for'");
		
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		//também pode ser feito de forma mais simples
		for (int i = 3; i < 100; i += 3 ){
            System.out.println(i);
        }
	}
}