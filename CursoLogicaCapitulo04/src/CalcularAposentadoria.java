import java.util.Scanner;

public class CalcularAposentadoria {
	
	static final Integer IDADE_MINIMA_APOSENTADORIA = 55;
	static final Integer TEMPO_MINIMO_CONTRIBUICAO = 25;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite a quantidade de tempo que contribuiu com a previdencia: ");
		int tempoContribuicaoPrevidencia = scanner.nextInt();
		
		if(idade >= IDADE_MINIMA_APOSENTADORIA && tempoContribuicaoPrevidencia >= TEMPO_MINIMO_CONTRIBUICAO) {
			System.out.println("Pode se aposentar!");
		} else {
			System.out.println("Nao pode se aposentar!");
		}
		
		
	}
}
