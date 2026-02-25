import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero da operacao: ");
		double primeiroNumero = scanner.nextDouble();
		
		System.out.print("Digite a operacao selecionada [1 - adicao, 2 - subtracao, 3 - multiplicacao, 4 - divisao]: ");
		int operacao = scanner.nextInt();
		
		System.out.print("Digite o segundo numero da operacao: ");
		double segundoNumero = scanner.nextDouble();
		
		Double total = 0.0;
		if(operacao == 1) {
			total = primeiroNumero + segundoNumero;
		} else if(operacao == 2) {
			total = primeiroNumero - segundoNumero;
		} else if(operacao == 3) {
			total = primeiroNumero * segundoNumero;
		} else {
			total = primeiroNumero / segundoNumero;
		}
		
		System.out.println("Total: " + total);
		scanner.close();
	}
}
