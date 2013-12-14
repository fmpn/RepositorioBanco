
public class ContaPoupança extends Conta {
	
	private double taxa;
	
	
	public ContaPoupança(String numero, double saldo, double limite, double taxa){
			super(numero, saldo,  limite);
			this.taxa = taxa;
			
	}
	
	public void transferir(double valor, Conta contaDestino){
		if(this.debitar(valor)){
			contaDestino.creditar(valor*0.8);			
		}else{
			System.out.println("Operação inválida!");
		}
	}
	
	

}
