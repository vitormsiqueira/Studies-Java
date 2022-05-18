package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoStringNumero {

	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro numero");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo numero");
		
		
		String soma = valor1 + valor2;
		System.out.println(soma);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma2 = numero1 + numero2;
		System.out.println("A soma é: " + soma2);
		System.out.println("A média é: " + soma2/2);
		
		
	}
}
