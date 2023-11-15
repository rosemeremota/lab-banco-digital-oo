
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		
		venilton.setNome("Venilton");
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(venilton);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        

        // TESTE ROSE
		Cliente rose = new Cliente();
		rose.setNome("Rose");
		rose.setEmail("rose@gmail.com");
		rose.setIdade(44);
		rose.setTelefone("999999999");

		Conta cCorrente = new ContaCorrente(rose);

		cCorrente.depositar(1000);
		cCorrente.depositar(200);
		
		//cCorrente.imprimirExtrato();
		cCorrente.imprimirSaldo();


		

	}

}
