import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class OrdenarNomes {
	
	public static void main(String[] args) throws IOException {
		Path arquivo = Paths.get("C:\\Users\\rrber\\eclipse-workspace\\CursoLogicaCapitulo12\\nomes.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		for (int i = 1; i < linhas.size(); i++) {
			String nomePosicaoBase = linhas.get(i);
			
			int j = i - 1;
			
			while (j >= 0 && nomePosicaoBase.compareTo(linhas.get(j)) < 0) {
				linhas.set(j + 1, linhas.get(j));
				j--;
			}
			
			linhas.set(j + 1, nomePosicaoBase);
		}
		
		Path outroArquivo = Paths.get("C:\\Users\\rrber\\eclipse-workspace\\CursoLogicaCapitulo12\\arquivo.txt");
		Files.write(outroArquivo, linhas);
		
	}

}
