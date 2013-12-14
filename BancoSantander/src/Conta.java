public class Conta {
	
	
	private String numero;
	private double saldo;
	private double limite;
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Conta(){
		
	}
	
	public boolean equals(Object o){
		if(o instanceof Conta)
		{
		Conta c = (Conta) o;
		if(this.numero.equals(c.numero)){
			return true;
		}
			else{
				return false;
			}
	}
		else
		{
			System.out.println("Operacão Inválida");
			return false;
		}
	
	
	}
	public void creditar(double valor){
		this.saldo = this.saldo + valor;
	}
	
	public boolean debitar(double valor){
		if(valor > this.saldo){
			System.out.println("Operação inválida!");
			return false;
		}else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	public void transferir(double valor, Conta contaDestino){
		if(this.debitar(valor)){
			contaDestino.creditar(valor);			
		}else{
			System.out.println("Operação inválida!");
		}
	}
	
	public Conta(String numero, double saldo, double limite) {
		this.numero = numero;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(String numero){
		this.numero = numero;
	}
}
	
	
	
	
	




