package fundamentos;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class DesafioConversao {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String salario1 = JOptionPane.showInputDialog("Digite seu primeiro salário");
		String salario2 = JOptionPane.showInputDialog("Digite seu segundo salário");
		String salario3 = JOptionPane.showInputDialog("Digite seu terceiro salário");
		
		float media = (
				Float.parseFloat(salario1.replace(",", "."))+
				Float.parseFloat(salario2.replace(",", "."))+
				Float.parseFloat(salario3.replace(",", "."))
				)/3
				;
		
		System.out.printf("A média do seu salário é de R$%.2f", media);
		
		entrada.close();
	}
}
