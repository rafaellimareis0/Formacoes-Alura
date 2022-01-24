
public class TesteContas {
	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente(1111, 11223);
		cc.deposita(100.0);
		
		ContaPoupanca cp = new ContaPoupanca(2222, 335544);
		cp.deposita(200.0);
		
		cc.transfere(40, cp);
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP " + cp.getSaldo());
	
	}
}
