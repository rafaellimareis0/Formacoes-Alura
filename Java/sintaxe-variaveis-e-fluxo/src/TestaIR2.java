
public class TestaIR2 {
	public static void main(String[] args) {
		System.out.println("Testando no laptop");
		
		int mes = 1; //declarando a variavel
		mes = mes + 1; //alterando valor da variavel
		
		switch (mes) { //la�o de condi��o
		case 1:
			System.out.println("Primeiro semestre");
			break;
		case 2:
			System.out.println("Segundo semestre");
			break;
		default:
			System.out.println("N�o � um semestre v�lido");
			break;
		}
	}
}
