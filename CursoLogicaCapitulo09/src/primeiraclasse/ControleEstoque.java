package primeiraclasse;

public class ControleEstoque {
	
	static final Integer quantidadeMinimaEstoque = 10;
	
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Camiseta";
		produto.precoUnitario = 29.99;
		produto.quantidade = 9;
		
		Boolean disponibilidade = verificarDisponibilidade(produto);
		
		if(disponibilidade) {
			System.out.println("O produto " + produto.nome + " está disponível para venda.");
		} else {
			System.out.println("O produto " + produto.nome + " não está disponível para venda.");
		}
	}
	
	static Boolean verificarDisponibilidade(Produto produto) {
		if(produto.quantidade >= quantidadeMinimaEstoque) {
			return true;
		} else {
			return false;
		}
	}

}
