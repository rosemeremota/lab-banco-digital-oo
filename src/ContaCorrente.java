
public class ContaCorrente extends Conta {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public void imprimirSaldo(){

		System.out.println("=== Saldo da Conta Corrente do cliente ===");
		super.imprimirSaldo();
	}
	
}
