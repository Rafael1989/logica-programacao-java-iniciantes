package bibliotecaemail;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnviarAtividadesEmail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<String> tarefas = new ArrayList<String>();
		
		while(true) {
			System.out.println("Digite a tarefa a ser enviada por email (ou 'x' para encerrar): ");
			String tarefa = scanner.nextLine();
			
			if(tarefa.equalsIgnoreCase("x")) {
				break;
			}
			
			tarefas.add(tarefa + "\n");
		}
		
		try {
			String body = "Lista de Tarefas:\n\n";
			for(String tarefa : tarefas) {
				body += "*" + tarefa;
			}
			Carteiro.enviar("rrbertoni21071989@gmail.com", "Lista de Tarefas", body);
			System.out.println("Email enviado com sucesso!");
		} catch (Exception e) {
			System.out.println("Erro ao enviar email: " + e.getMessage());
		}
		
		scanner.close();
	}
}
