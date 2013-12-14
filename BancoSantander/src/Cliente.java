
public class Cliente {
	
	protected int cpf;
	protected String Nome= "a";
	protected Conta numero;
	public TipoCliente tipoCliente; 
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setNome(String nome) {
		Nome = nome;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNumero(Conta numero) {
		this.numero = numero;
	}
	
	public Conta getNumero() {
		return numero;
	}
	
	public Cliente(TipoCliente a){
		this.tipoCliente = a;
	}
	public Cliente()
	{
		
	}

}
