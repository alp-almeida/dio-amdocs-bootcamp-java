
public class ContaCorrente extends Conta{
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void extrato() {
		System.out.println("Extrato -----------------------------------");
		System.out.println("Tipo:\t\tConta corrente");
		System.out.println(imprimirDadosComuns());
	}
	
}
