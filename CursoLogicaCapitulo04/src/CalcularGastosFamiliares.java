import java.util.Scanner;

public class CalcularGastosFamiliares {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Double gastosMes = 0.0;
		
		System.out.print("Digite o valor da conta de luz: ");
		gastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da conta de agua: ");
		gastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da conta do telefone: ");
		gastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da escola do filho: ");
		gastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor da fatura do cartao: ");
		gastosMes += scanner.nextDouble();
		
		System.out.print("Digite o valor do supermercado: ");
		gastosMes += scanner.nextDouble();
		
		System.out.println("Gastos totais do mes: " + gastosMes);
		scanner.close();
	}

}
