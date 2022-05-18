package classe;

// Acessar um atributo que esta definido na instencia

public class Desafio {
	
	int a = 3; // não pode mexer nessa linha
	
	// pode mexer no main
	public static void main(String[] args) {
	
		Desafio var = new Desafio();
				
		System.out.println(var.a);

	}
}
