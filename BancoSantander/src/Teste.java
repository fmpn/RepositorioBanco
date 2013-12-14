import java.util.Scanner;


public class Teste {
	
	public static void main(String[] args) {
		

		int contador = 0;
		int contador2=0;
	
		
		Cliente[] Pessoa;
		Pessoa = new Cliente[10];
		Pessoa[0] = new Cliente(); 
		
		Scanner input = new Scanner(System.in);
		
		while (contador != 10)
		{
			System.out.println("Digite seu nome");
			String nome = input.next();
			
			contador2 = 0;
			while( contador2 != 10 )
			{
				if(Pessoa[contador2].Nome.equals(nome) == true)
				{
					System.out.println("Pessoa já existe");
					contador2 = 10;
				}
				else
				{
					contador2++;
					System.out.println("entrou");
				}
				
				if(contador2==9)
				{
					Pessoa[contador].Nome = nome;
					contador2++;
				}
				
				
			}
			
			contador++;
			
			
		}
			
		
			while (contador2 != 10)
			{
				System.out.println(Pessoa[contador2].Nome);
			}
	
	}

}
