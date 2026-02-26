
public class VetoresMaisDe2Dimensoes {
	public static void main(String[] args) {
		Double[] faturamentoJaneiro = new Double[] {1500.0, 2000.0, 1700.0};
		Double[] faturamentoFevereiro = new Double[] {1000.0, 2500.0, 1800.0};
		
		Double[][] faturamentoAnual = new Double[][] { faturamentoJaneiro, faturamentoFevereiro };	
		
		Double[][][] faturamentoQuinquenal = new Double[][][] { faturamentoAnual };
		
		Double[][][][] faturamentoDaDecada = new Double[][][][] { faturamentoQuinquenal };
		
		// tem que percorrer os 4 níveis de vetores para acessar o valor do dia 1° de Janeiro, 
		
		for(int i = 0; i < faturamentoDaDecada.length; i++) {
			Double[][][] quinquenal = faturamentoDaDecada[i];
			
			for(int y = 0; y < quinquenal.length; y++) {
				Double[][] anual = quinquenal[y];
				
				for(int z = 0; z < anual.length; z++) {
					Double[] mensal = anual[z];
					
					System.out.println("Mes " + (z + 1) + ":");
					
					for(int a = 0; a < mensal.length; a++) {
						Double dia = mensal[a];
						System.out.println("Dia " + (a + 1) + ": " + dia);
					}
				}
			}
		}
		
	}
}
