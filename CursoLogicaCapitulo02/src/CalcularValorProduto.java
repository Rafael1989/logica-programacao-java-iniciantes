import java.util.Scanner;

public class CalcularValorProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: ");
		double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		double quantidadeProduto = scanner.nextDouble();
		
		Double total = valorProduto * quantidadeProduto;
		
		
		if(total > 10) {
			total = total * 0.9;
		}
		
		System.out.println("Valor total: " + total);
		scanner.close();
	}
}
