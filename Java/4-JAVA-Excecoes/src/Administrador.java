
public class Administrador extends Funcionarios {

	public static void main(String[] args) {
		Administrador adm = new Administrador();
		adm.setNome("Rafael Lima");
		adm.setCpf(999000222);
		adm.setSalario(5000.0);
		
		System.out.println("Nome do adm " + adm.getNome());
		System.out.println("CPF "+ adm.getCpf());
		System.out.println("Salario "+ adm.getSalario());
	}

}
