package fundamentos.operadores;

public class DesafioAritmetico {

	public static void main(String[] args) {
				
		int numeradorA = (int) (Math.pow((6 * (3 + 2)), 2));
		
		int denominadorA = (int) 3 * 2;

		
		int numeradorB = (int) ((1 - 5) * (2 - 7));
		
		int denominadorB = 2;
		
		
		int inferior = (int) Math.pow(10, 3);
		
		
		int superior = (int) Math.pow(((numeradorA / denominadorA) - Math.pow((numeradorB / denominadorB), 2)), 3);
				
		int result = (int) superior / inferior;
				
		System.out.println(result);
	}
}
