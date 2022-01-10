
public class TestaValores {
	public static void main(String[] args) {
		System.out.println("Guardando valores em variaveis");

		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro; // o segundo numero agora vale o primeiro
		primeiro = 10; // o segundo continua valendo 5 porque essa declaracao vem depois então não
						// altera o valor do primeiro
		segundo = primeiro; // agora sim o valor foi trocado para '10' porque a variavel foi trocada na
							// linha acima

		System.out.println(segundo);
	}
}
