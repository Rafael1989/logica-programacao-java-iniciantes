package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PlanejadorTarefas {
	
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		
		List<String> tarefas = new ArrayList<String>();
		
		while(true) {
			System.out.println("Digite uma tarefa (ou 'x' para encerrar): ");
			String tarefa = scanner.nextLine();
			
			if(tarefa.equalsIgnoreCase("x")) {
				break;
			}
			
			tarefas.add(tarefa);
		}

		Path arquivo = Paths.get("C:\\Users\\rrber\\eclipse-workspace\\CursoLogicaCapitulo10\\tarefas.txt");
		Files.write(arquivo, tarefas);
		
		scanner.close();
	}

}
