
public class Cliente {
	private String nome;
	private String cpf;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Cliente(String nome, String cpf) {
		super();
		this.nome = nome;
		this.cpf = cpf;
	}
	@Override
	public String toString() {
		String saida ="Nome:\t\t" + nome + "\n";
		saida += "CPF:\t\t" + cpf;
		return saida;
	}
	
	
	
}
