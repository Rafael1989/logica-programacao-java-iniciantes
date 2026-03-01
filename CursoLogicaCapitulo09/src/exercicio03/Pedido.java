package exercicio03;

public class Pedido {
	
	private Integer codigo;
	private Double subtotal;
	private Double desconto;
	
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
	public void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	
	public Double getSubtotal() {
		return subtotal;
	}
	
	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	
	public Double getDesconto() {
		return desconto;
	}
	
	public Double getTotal() {
		return this.subtotal - this.desconto;
	}

	public void exibirInformacoesPedido(Pedido pedido) {
		System.out.println("Código do Pedido: " + pedido.getCodigo());
		System.out.println("Subtotal: R$ " + pedido.getSubtotal());
		System.out.println("Desconto: R$ " + pedido.getDesconto());
		System.out.println("Total a Pagar: R$ " + pedido.getTotal());
	}

}
