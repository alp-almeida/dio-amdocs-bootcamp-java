
public class ContaPoupanca extends Conta{
	
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	public void extrato() {
		System.out.println("Extrato -----------------------------------\n");
		System.out.println("Tipo:\t\tConta corrente");
		System.out.println(imprimirDadosComuns());
	}

}
