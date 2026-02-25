import java.util.Scanner;

public class CalculaValorProduto {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		double valorProduto = scanner.nextDouble();
		
		if(valorProduto < 100) {
			valorProduto = valorProduto + 15;
		}
		
		System.out.println("Valor do produto: " + valorProduto);
		scanner.close();
	}

}
