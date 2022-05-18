/*
 * Um wrapper é uma versão orientada a objetos dos tipos
 * primitivos de dados.
*/


package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		// byte
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000; // int
		Integer ii = Integer.parseInt("10000");
		Long l = 100000L;
	
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(ii);
		
		System.out.println(i);
		
		System.out.println(l);
		
		Boolean boo = Boolean.parseBoolean("true");
		System.out.println(boo);
		System.out.println(boo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");
	}
	
}
