import java.util.Scanner; //importar biblioteca para escanear o teclado

public class TesteIMC {
	public static void main(String[] args) {
		System.out.println("Criando um programa para calcular o IMC");
		
		Scanner leitor = new Scanner(System.in); //abrir a leitura do teclado
		System.out.println("Digite seu peso: "); 
		double peso = leitor.nextDouble(); //criar variavel para guardar o peso digitado
		System.out.println("Digite sua altura: ");
		double altura = leitor.nextDouble(); //criar variavel para guardar a altura digitada
		double imc; //criar variavel para guardar o IMC calculado
		imc = peso / (altura * altura); //calculo do IMC a partir das informações digitadas pelo usuario
		System.out.println("O IMC é " + imc); //imprimir o valor do IMC
				
	}
}
