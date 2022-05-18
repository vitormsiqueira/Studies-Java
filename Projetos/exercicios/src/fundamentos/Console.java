package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
//		System.out.printf("Nome: %s", "João");
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
//		System.out.println("\nNome = " + nome);
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
//		System.out.println("\nSobrenome = " + sobrenome);
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
//		entrada.nextLine(); //lê o "\\n" que o teclado.nextInt() deixa para trás.

		System.out.println("Digite seu peso: ");
		int peso = entrada.nextInt();
		
		System.out.printf("Me chamo %s %s e tenho %d anos e peso %d Kg. %n", nome, sobrenome, idade, peso);
		
		entrada.close();
	}
}
