import java.util.Scanner;

public class ValidaNota {
	
	static final Double NOTA_CORTE = 70.0;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a nota do aluno: ");
		double notaAluno = scanner.nextDouble();
		
		if(notaAluno > NOTA_CORTE) {
			System.out.println("Passou!");
		} else {
			System.out.println("Nao passou!");
		}
		
		scanner.close();
	}

}
