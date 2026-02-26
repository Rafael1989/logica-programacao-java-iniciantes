import java.util.Scanner;

public class CalcularBonusFuncionario {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor da meta do faturamento anual da empresa: ");
		Double metaFaturamentoAnualEmpresa = scanner.nextDouble();
		
		System.out.print("Digite o faturamento real da empresa: ");
		Double faturamentoRealEmpresa = scanner.nextDouble();
		
		System.out.print("Digite a média salarial anual do funcionário para o ano anterior: ");
		Double mediaSalarialAnualFuncionario = scanner.nextDouble();
		
		Boolean metaAtingida = faturamentoRealEmpresa >= metaFaturamentoAnualEmpresa;
		
		if(metaAtingida) {
			System.out.println("Parabéns! Você atingiu a meta de faturamento anual da empresa e receberá um bônus de: " + mediaSalarialAnualFuncionario);
		} else if(faturamentoRealEmpresa >= (metaFaturamentoAnualEmpresa * 0.8)) {
			System.out.println("Parabéns! Você atingiu 80% da meta de faturamento anual da empresa e receberá um bônus de: " + (mediaSalarialAnualFuncionario * 0.8));
		} else {
			System.out.println("Infelizmente, você não atingiu a meta de faturamento anual da empresa e não receberá um bônus.");
		}
		
		scanner.close();
	}
}
