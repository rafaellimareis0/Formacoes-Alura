
public class ExercicioWhileParaFor {
	public static void main(String[] args) {
		System.out.println("Exercicio das aulas transformando 'while' em 'for'");
		
		int i = 0; //declarando e iniciando a variavel
		while(i <= 10) { //condição até onde o valor da variavel vai
			System.out.println(i); //imprimir a variavel sempre que passar por aqui
			i++; //adicionar '1' na variavel sempre que chegar aqui
		}
		
		for (int contador = 0; contador <= 10; contador++) { //mesmo código acima só que em 'for'
			System.out.println(contador);
		}
	}
}
