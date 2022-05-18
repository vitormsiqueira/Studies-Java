package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		String s = "Boa tarde";
		
		System.out.println(s.concat("!!!"));
		System.out.println(s + ("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Vitor";
		var sobrenome = "Siqueira";
		var idade = 33;
		var salario = 12485.984;
		
		System.out.println("\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalario: " + salario + "\n");
		
		System.out.printf("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
		
		System.out.println(frase);
	}
}
