import java.util.Scanner;

public class CalcularOperacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o primeiro número: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		Double numero2 = scanner.nextDouble();
		
		System.out.println("Escolha a operação: [1] - Soma, [2] - Subtração");
		Integer operacaoEscolhida = scanner.nextInt();
		
		if(operacaoEscolhida == 1) {
			somar(numero1, numero2);
		} else if(operacaoEscolhida == 2) {
			subtrair(numero1, numero2);
		} else {
			System.out.println("Operação inválida");
		}
		
		scanner.close();
	}
	
	static void somar(Double numero1, Double numero2) {
		Double resultado = numero1 + numero2;
		System.out.println("Resultado da soma: " + resultado);
	}
	
	static void subtrair(Double numero1, Double numero2) {
		Double resultado = numero1 - numero2;
		System.out.println("Resultado da subtração: " + resultado);
	}
}
