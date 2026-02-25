import java.util.Scanner;

public class ImprimeNomeCompleto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite seu primeiro nome: ");
		String primeiroNome = scanner.nextLine();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
		scanner.close();
	}
}
