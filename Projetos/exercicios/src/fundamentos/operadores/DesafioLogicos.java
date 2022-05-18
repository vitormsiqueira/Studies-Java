package fundamentos.operadores;

public class DesafioLogicos {

	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		boolean trab1 = true;
		boolean trab2 = false;
		
		boolean comprouTV50 = trab1 && trab2;
		boolean comprouTV32 = trab1 ^ trab2;
		boolean comprouSorvete = trab1 || trab2;
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou TV 50\" ? " + comprouTV50);
		System.out.println("Comprou TV 32\" ? " + comprouTV32);
		System.out.println("Tomou sorvete? " + comprouSorvete);
		System.out.println("Mais Saudável? " + maisSaudavel);

	} 
} 
 