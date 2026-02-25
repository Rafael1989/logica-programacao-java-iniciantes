import java.util.Scanner;

public class CalcularIMC {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a altura: ");
		Double altura = scanner.nextDouble();
		
		Double imc = peso / (altura * altura);
		System.out.println("IMC: " + imc);
		
		scanner.close();
	}

}
