
public class RetornandoValores {
//	public static void main(String[] args) {
//		Integer numeroQualquer = numeroAleatorio();
//		
//		System.out.println("Número: " + numeroQualquer);
//	}
//	
//	static Integer numeroAleatorio() {
//		Integer numero = 1;
//		return numero;
//	}
	
	public static void main(String[] args) {
		// 50 --- 100%
		// x  ---  20%
		
		Double premissaInicial[] = new Double[] {725.5, 100.0};
		Double proporcao = 20.0;
		
		Double resultadoFinal = regraDeTres(premissaInicial, proporcao);
		
		imprimir("Resultado: " + resultadoFinal);
	}
	
	static void imprimir(String texto) {
		System.out.println(texto);
	}
	
	static Double regraDeTres(Double[] premissa, Double proporcao) {
		Double resultado = (proporcao * premissa[0]) / premissa[1];
		return resultado;
	}
}
