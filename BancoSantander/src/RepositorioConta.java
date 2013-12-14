
public class RepositorioConta {
	

	Conta[] Conjunto = new Conta[100];
	
	
	public void inserirConta(int indice,String numero){
		
		this.Conjunto[indice] = new Conta(numero);
		
	}
	
	public void remover(String numero){
		Conta nula;
		nula = this.pesquisar(numero);
		
		
		
	}
	
	public Conta pesquisar(String numero){
		for(int cont = 0 ; cont < 100 ; cont++){
		
			if(Conjunto[cont].equals("numero") == true){
				return Conjunto[cont];
				
			}
		}
		
		return null;
		
	}
	

	

	

}
