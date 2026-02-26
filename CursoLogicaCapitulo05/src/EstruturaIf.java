
public class EstruturaIf {
	
	public static void main(String[] args) {
		Double emprestimo = 4000.00;
		Double movimentacaoMediaMensal = 2000.00;
		
		Boolean movimentaPeloMenosMetadeDoValor = movimentacaoMediaMensal * 2 >= emprestimo;
		Boolean aContaTemTempoSuficienteDeAbertura = true;
		Boolean temNomeLimpo = true;
		
		Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor 
				&& aContaTemTempoSuficienteDeAbertura && temNomeLimpo;
		
		if(liberarEmprestimo) {
			System.out.println("Liberar emprestimo");
		} else {
			System.out.println("Nao liberar emprestimo");
		}
	}

}
