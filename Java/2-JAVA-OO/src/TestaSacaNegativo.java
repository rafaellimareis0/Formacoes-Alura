

public class TestaSacaNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta(2, 3);
		conta.deposita(100);
		System.out.println(conta.saca(200));
		
		conta.saca(101);
		System.out.println(conta.getSaldo());
		
		
	}
}
