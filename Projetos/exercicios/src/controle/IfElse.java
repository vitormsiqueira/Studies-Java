package controle;

import javax.swing.JOptionPane;

public class IfElse {
	public static void main(String[] args) {
		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Informe a média: ");
//		double media = entrada.nextDouble();
//		
//		if(media <= 10 && media >= 7.0) {
//			System.out.println("Aprovado!");
//			System.out.println("Parabéns!");
//			System.out.println(media);
//		} else {System.out.println("Reprovado!");}
//		
//		entrada.close();

		String valor = JOptionPane.showInputDialog("Informe o numero:");
		int numero = Integer.parseInt(valor);
		
		if(numero % 2 == 0) {
			System.out.println("Número par!");
		} else {
			System.out.println("Número ímpar!");
		}
		
	}
}
