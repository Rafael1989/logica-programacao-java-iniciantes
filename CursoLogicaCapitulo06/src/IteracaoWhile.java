
public class IteracaoWhile {

	public static void main(String[] args) {
//		int i = 0;
//		while(i < 10) {
//			if(i == 5) {
//				System.out.println("Vai parar!");
//				break; // sai fora do while
//			}
//			System.out.println("Um texto qualquer");
//			i++;
//		}
		
		int i = 0;
		while(i < 10) {
			if(i == 5) {
				System.out.println("Vai continuar!");
				i++; // para evitar o loop infinito
				continue; // sai fora do while
			}
			System.out.println("Um texto qualquer");
			i++;
		}
		
	}
}
