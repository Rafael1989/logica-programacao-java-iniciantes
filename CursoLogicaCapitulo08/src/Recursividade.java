
public class Recursividade {

//	public static void main(String[] args) {
//		imprimirNumero(1);
//	}
//	
//	static void imprimirNumero(Integer numero) {
//		System.out.println(numero);
//		
//		if(numero < 10) {
//			imprimirNumero(++numero);
//		}
//	}
	
	public static void main(String[] args) {
		String[] alunos = new String[] {"João", "Maria", "José", "Ana"};
		
		iterarNomes(alunos, 0);
	}
	
	static void iterarNomes(String[] nomes, Integer posicao) {
		System.out.println(nomes[posicao]);
		
		if(posicao < nomes.length - 1) {
			iterarNomes(nomes, ++posicao);
		}
	}
}
