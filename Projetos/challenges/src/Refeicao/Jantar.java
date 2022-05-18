package Refeicao;

public class Jantar {
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.12);
		Comida c2 = new Comida("Feijão", 0.16);
		Comida c3 = new Comida("Salada", 0.1);
		
		Pessoa p = new Pessoa("Vitor", 78);
		
		System.out.printf("Peso de %s antes do jantar: %.2f\n", p.nome, p.peso);
		p.Comer(c1);
		p.Comer(c2);
		p.Comer(c3);
		System.out.printf("Peso após o jantar: %.2f", p.peso);
	}
}
