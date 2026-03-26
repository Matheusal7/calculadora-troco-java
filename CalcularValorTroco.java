package cursologicajava1;

import java.util.Scanner; 

public class CalcularValorTroco {
	
		public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do produto: ");
		double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite quantidade passada pelo cliente: ");
		double valorPassadoPeloCliente = scanner.nextDouble();
		
		double resultado = valorPassadoPeloCliente - valorProduto;	
		
		System.out.println("Troco: " + resultado);
		
		scanner.close();
		
		
			
			
			
			
			
			
		}	

	}
	
	


