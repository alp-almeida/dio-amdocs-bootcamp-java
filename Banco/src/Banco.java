
public class Banco {
	
	private String nome;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cli_cc = new Cliente("André", "90000000000");
		Cliente cli_cp = new Cliente("Mirian","90000000001");
		ContaCorrente cc = new ContaCorrente(cli_cc);
		ContaPoupanca cp = new ContaPoupanca(cli_cp);
		cc.extrato();
		cp.extrato();
	}

}
