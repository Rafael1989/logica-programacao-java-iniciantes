import console.Interacao;

public class CalcularValorTroco {
	public static void main(String[] args) {
		Interacao interacao = new Interacao();
		
		Double valorProduto = interacao.lerDecimal("Digite o valor do produto: ");

		Double valorPassadoPeloCliente = interacao.lerDecimal("Digite quantidade passada pelo cliente: ");
		
		Double resultado = valorPassadoPeloCliente - valorProduto;
		
		System.out.println("Troco: " + resultado);
		
		interacao.fechar();
	}
}
