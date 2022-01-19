
public class Conta {
	private static int AGENCIA_PADRAO = 1000;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	
	protected Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = Conta.SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	// getters
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	// métodos
	public void sacar(double valor) {
		this.saldo -= valor;
	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}
	
	protected String imprimirDadosComuns() {
		String saida = "Agência:\t" + getAgencia() + "\n";
		saida += "Número: \t" + getNumero() + "\n";
		saida += this.cliente.toString();
		saida += "\nSaldo:\t \t" + getSaldo();
		return saida;
	}
	
	
}
