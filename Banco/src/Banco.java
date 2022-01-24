
public class Banco {
	
	private String nome;
	List<Cliente> clientes = new ArrayList();

	public void getListaClientes(){

		for (Cliente c : clientes) {
			System.out.println(c.toString());
		}

	}

}
