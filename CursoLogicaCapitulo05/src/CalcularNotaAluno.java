import java.util.Scanner;

public class CalcularNotaAluno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota do aluno de portugues: ");
		Double notaPortugues = scanner.nextDouble();
		
		System.out.print("Digite a nota do aluno de matematica: ");
		Double notaMatematica = scanner.nextDouble();
		
		Double notaFinal = notaPortugues + notaMatematica;
		Boolean aprovado = ((notaFinal >= 150) && (notaPortugues >= 60) && (notaMatematica >= 60));
		if(aprovado) {
			System.out.println("Aluno aprovado");
		} else {
			System.out.println("Aluno reprovado");
		}
		
		scanner.close();
	}
}
