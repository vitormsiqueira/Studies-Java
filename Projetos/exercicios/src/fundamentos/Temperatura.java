package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (�F - 32) x 5/9 = �C
		
		final int ajuste = 32;
		final double fator = 5 / 9.0;
		double celcius = 38.3;
		double farenhait;
		
		farenhait = (celcius / fator ) + ajuste; 
		
		System.out.println("A temperatura " + celcius + "�C em Farenhait �: " + farenhait + "�F");
		
	}
}
