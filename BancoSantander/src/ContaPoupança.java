
public class ContaPoupan�a extends Conta {
	
	private double taxa;
	
	
	public ContaPoupan�a(String numero, double saldo, double limite, double taxa){
			super(numero, saldo,  limite);
			this.taxa = taxa;
			
	}
	
	public void transferir(double valor, Conta contaDestino){
		if(this.debitar(valor)){
			contaDestino.creditar(valor*0.8);			
		}else{
			System.out.println("Opera��o inv�lida!");
		}
	}
	
	

}
