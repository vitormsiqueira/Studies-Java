package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ler num1
		// Ler num2
		// Ler operação desejada: + - * / %
		
		Scanner entrada = new Scanner(System.in);

//		System.out.println("Digite o primeiro numero: ");
//		String Snum1 = entrada.nextLine();
//		double num1 = Double.valueOf(Snum1); 
//		
//		System.out.println("Digite o segundo numero: ");
//		String Snum2 = entrada.nextLine();
//		double num2 = Double.valueOf(Snum2);
//		
//		System.out.println("Digite o operador desejado: ");
//		String operator = entrada.nextLine();
		
		System.out.println("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();

		System.out.println("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.println("Digite o operador desejado: ");
		String operator = entrada.next();
		
		double result = operator.equals("+") ? num1 + num2 : 
			(operator.equals("-") ? num1 - num2 : 
				(operator.equals("*") ? num1 * num2 : 
					(operator.equals("/") ? num1 / num2 : 
						(operator.equals("%") ? num1 % num2 : 0))));
		
		System.out.println("O resultado é: " + result);
		
		entrada.close();
	}
}
