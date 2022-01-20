
public class TestaSwitch2 {
	public static void main(String[] args) {
		System.out.println("Testando no laptop");
		
		int mes = 1; //declarando a variavel
		mes = mes + mes * 2; //alterando valor da variavel 'mes'
		
		switch (mes) { //laço de condição
		case 1:
			System.out.println("Primeiro semestre");
			break;
		case 2:
			System.out.println("Segundo semestre");
			break;
		default:
			System.out.println("Não é um semestre válido");
			break;
		}
	}
}