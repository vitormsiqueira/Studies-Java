package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String salario1 = JOptionPane.showInputDialog("Digite seu primeiro sal�rio");
		String salario2 = JOptionPane.showInputDialog("Digite seu segundo sal�rio");
		String salario3 = JOptionPane.showInputDialog("Digite seu terceiro sal�rio");
		
		float media = (
				Float.parseFloat(salario1.replace(",", "."))+
				Float.parseFloat(salario2.replace(",", "."))+
				Float.parseFloat(salario3.replace(",", "."))
				)/3
				;
		
		System.out.printf("A m�dia do seu sal�rio � de R$%.2f", media);
		
		entrada.close();
	}
}
