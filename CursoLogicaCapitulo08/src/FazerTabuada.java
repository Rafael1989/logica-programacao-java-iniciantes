import java.util.Scanner;

public class FazerTabuada {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número para calcular a tabuada: ");
		Integer numero = scanner.nextInt();
		
		imprimirTabuada(numero);
	}
	
	static void imprimirTabuada(Integer multiplicando) {
		for(Integer i = 0; i <= 10; i++) {
			Integer resultado = multiplicando * i;
			System.out.println(multiplicando + " x " + i + " = " + resultado);
		}
	}
}
