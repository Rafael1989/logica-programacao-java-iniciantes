import java.util.Scanner;

public class UtilizandoIfEncadeado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o peso da pessoa: ");
		Double peso = scanner.nextDouble();
		
		Boolean pesoLeve = peso <= 60 && peso > 0;
		Boolean pesoMedio = peso > 60 && peso <= 90;
		Boolean pesoPesado = peso > 90;
		
		if(pesoLeve) {
			System.out.println("Peso leve");
		} else if(pesoMedio) {
			System.out.println("Peso medio");
		} else if(pesoPesado) {
			System.out.println("Peso pesado");
		} else {
			System.out.println("Peso invalido");
		}
		
		scanner.close();
	}

}
