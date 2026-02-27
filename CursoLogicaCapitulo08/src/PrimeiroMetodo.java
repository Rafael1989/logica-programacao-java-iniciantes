import java.util.Scanner;

public class PrimeiroMetodo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		exibirOpcoes("Escolha dentre os cursos abaixo:", cursos);
		Integer posicaoCursoEscolhido = selecionarOpcao(scanner, cursos, "O curso que voce deseja eh: ");
		String cursoEscolhido = obterOpcaoSelecionada(cursos, posicaoCursoEscolhido);
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartao de credito", "Boleto"};
		exibirOpcoes("Escolha dentre as formas de pagamento abaixo:", formasPagamento);
		Integer posicaoFormaPagamentoEscolhida = selecionarOpcao(scanner, formasPagamento, "Sua forma de pagamento é: ");
		String formaPagamentoEscolhida = obterOpcaoSelecionada(formasPagamento, posicaoFormaPagamentoEscolhida);
		
		exibirResultado(cursoEscolhido, formaPagamentoEscolhida);

		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("--------------------------------------------");
	}
	
	static void exibirOpcoes(String titulo, String[] opcoes) {
		System.out.println(titulo);
		for(int i = 0; i < opcoes.length; i++) {
			System.out.println("[" + i + "] - " + opcoes[i]);
		}
	}
	
	static Integer selecionarOpcao(Scanner scanner, String[] opcoes, String mensagem) {
		System.out.print(mensagem);
		Integer posicaoEscolhida = scanner.nextInt();
		
		Boolean posicaoValida = validarPosicao(posicaoEscolhida, opcoes.length);
		
		if(!posicaoValida) {
			System.out.println("Opção inválida");
			System.exit(1);
		}
		
		return posicaoEscolhida;
	}
	
	static Boolean validarPosicao(Integer posicao, Integer tamanhoArray) {
		return posicao >= 0 && posicao < tamanhoArray;
	}
	
	static void exibirResultado(String cursoEscolhido, String formaPagamentoEscolhida) {
		imprimirTraco();
		System.out.println("Voce escolheu o curso: " + cursoEscolhido);
		System.out.println("Forma de pagamento: " + formaPagamentoEscolhida);
		imprimirTraco();
	}
	
	static String obterOpcaoSelecionada(String[] opcoes, Integer posicao) {
		return opcoes[posicao];
	}
}
