
public class TestaValores {

	public static void main(String[] args) {
		Conta conta = new Conta(20, 30);
		
		System.out.println(conta.getNumero());
		System.out.println(conta.getAgencia());
		
		Conta conta2 = new Conta (20, 122);
		Conta conta3 = new Conta (20, 457);
		
		System.out.println(Conta.getTotal());
	}
}
