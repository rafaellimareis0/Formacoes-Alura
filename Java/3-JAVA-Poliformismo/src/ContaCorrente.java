
/* new ContaCorrente() - nesse caso deveria chamar o construtor padrão
 * mas como é herança então ele tenta chamar o construtor da classe mãe
 */
//new ContaCorrente()
public class ContaCorrente extends Conta {

	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
        super.saldo += valor;
    }
	
}