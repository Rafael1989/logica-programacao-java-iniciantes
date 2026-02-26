import java.util.Scanner;

public class CadastrarTarefas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] tarefas = new String[5];
		for(int i = 0; i < 5; i++) {
			System.out.print("Digite a tarefa: ");
			String tarefa = scanner.nextLine();
			tarefas[i] = tarefa;
		}
		
		for(int i = 0; i < tarefas.length; i++) {
			System.out.println("Tarefa " + (i + 1) + ": " + tarefas[i]);
		}
		
		scanner.close();
	}
}
