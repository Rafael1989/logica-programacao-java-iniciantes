import java.util.Scanner;

public class EstruturaSwitch {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o mes: ");
		Integer mes = scanner.nextInt();
		
		Double desconto = 0.0;
		
//		if(mes.equals(1)) {
//			desconto = 0.0;
//		} else if(mes.equals(2)) {
//			desconto = 0.0;
//		} else if(mes.equals(3)) {
//			desconto = 15.0;
//		} else if(mes.equals(4)) {
//			desconto = 30.0;
//		} else if(mes.equals(5)) {
//			desconto = 30.0;
//		} else if(mes.equals(6)) {
//			desconto = 10.0;
//		} else if(mes.equals(7)) {
//			desconto = 10.0;
//		} else if(mes.equals(8)) {
//			desconto = 10.0;
//		} else if(mes.equals(9)) {
//			desconto = 10.0;
//		} else if(mes.equals(10)) {
//			desconto = 20.0;
//		} else if(mes.equals(11)) {
//			desconto = 10.0;
//		} else if(mes.equals(12)) {
//			desconto = 0.0;
//		} else {
//			System.out.println("Mes invalido");
//			System.exit(1);
//		}
		
		switch(mes) {
			case 1:
			case 2:
			case 12:
				desconto = 0.0;
				break;
			case 3:
				desconto = 15.0;
				break;
			case 4:
				desconto = 30.0;
				break;
			case 5:
			case 6:
			case 7:
			case 8:
			case 9:
			case 11:
				desconto = 10.0;
				break;
			case 10:
				desconto = 20.0;
				break;
			default:
				System.out.println("Mes invalido");
				System.exit(1);
		}
		
		System.out.println("Desconto: " + desconto);

		scanner.close();
		
		String nome = "Alexandre";
		switch(nome) {
			case "Alexandre":
				System.out.println("O nome é Alexandre");
				break;
			case "Maria":
				System.out.println("O nome é Maria");
				break;
			default:
				System.out.println("O nome é outro");
		}
		
		Character letra = 'A';
		switch(letra) {
			case 'A':
				System.out.println("A letra é A");
				break;
			case 'B':
				System.out.println("A letra é B");
				break;
			default:
				System.out.println("A letra é outra");
		}
		
	}

}
