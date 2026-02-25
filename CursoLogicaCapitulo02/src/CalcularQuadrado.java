import java.util.Scanner;

public class CalcularQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número para calcular o quadrado: ");
		double numero = scanner.nextDouble();
		
		System.out.println("O quadrado de " + numero + " é: " + (numero * numero));
		
		scanner.close();
	}

}
