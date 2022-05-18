package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
		
	public static void main(String[] args) {
		
		double a = 1; // convers�o impl�cita
		System.out.println(a);
		
		// precisa de forma explicita afirmar que esse valor (por padr�o lido como double) sera armazenado como float, das 2 formas abaixo
		float b = 1.288F; 
		float c = (float) 1.288; // convers�o expl�cita (CAST)
		
		System.out.println(b);
		System.out.println(c);
		
		int d = 2;
		byte e = (byte) d; // convers�o expl�cita (CAST)
		
		System.out.println(e);
	}

}
