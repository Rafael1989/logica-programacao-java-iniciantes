package primeiraclasse;

public class PrimeiraClasse {

	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.nome = "Camiseta";
		produto.precoUnitario = 29.99;
		produto.quantidade = 100;
		
		exibirQuantidadeEmEstoque(produto);
	}
	
	static void exibirQuantidadeEmEstoque(Produto produto) {
		System.out.println("Quantidade em estoque do produto " + produto.nome + " é de " + produto.quantidade + " unidades.");
	}
}
