package exercicio03;

public class MostrarPedido {
	
	public static void main(String[] args) {
		Pedido pedido = new Pedido();
		pedido.setCodigo(12345);
		pedido.setSubtotal(100.0);
		pedido.setDesconto(15.0);
		
		pedido.exibirInformacoesPedido(pedido);
	}

}
