import java.util.Scanner;

public class PrimeiroMetodo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		imprimirTraco();
		
		String[] cursos = new String[] {"Java EE", "Spring", "Java OO Avançado"};
		
		System.out.println("Escolha dentre os cursos abaixo:");
		
		for(int i = 0; i < cursos.length; i++) {
			System.out.println("[" + i + "] - " + cursos[i]);
		}
		
		System.out.print("O curso que voce deseja eh: ");
		Integer posicaoCursoEscolhido = scanner.nextInt();
		
		Boolean cursoValido = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < cursos.length;
		
		if(!cursoValido) {
			System.out.println("Curso invalido");
			System.exit(1);
		}
		
		imprimirTraco();
		
		String[] formasPagamento = new String[] {"Cartao de credito", "Boleto"};
		
		System.out.println("Escolha dentre as formas de pagamento abaixo:");

		for(int i = 0; i < formasPagamento.length; i++) {
			System.out.println("[" + i + "] - " + formasPagamento[i]);
		}
		
		System.out.print("Sua forma de pagamento é: ");
		Integer posicaoFormaPagamentoEscolhida = scanner.nextInt();
		
		Boolean posicaoValida = posicaoFormaPagamentoEscolhida >= 0 && posicaoFormaPagamentoEscolhida < formasPagamento.length;
		
		if(!posicaoValida) {
			System.out.println("Forma de pagamento invalida");
			System.exit(1);
		}
		
		String cursoEscolhido = cursos[posicaoCursoEscolhido];
		String formaPagamentoEscolhida = formasPagamento[posicaoFormaPagamentoEscolhida];
		
		imprimirTraco();
		
		System.out.println("Voce escolheu o curso: " + cursoEscolhido + " e a forma de pagamento: " + formaPagamentoEscolhida);

		scanner.close();
	}
	
	static void imprimirTraco() {
		System.out.println("--------------------------------------------");
	}
}
