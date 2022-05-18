package fundamentos;

public class TipoStringEqual {

	public static void main(String[] args) {
		
		System.out.println("2" == "2");
		
		String s1 = new String("2");
		System.out.println("2" == s1); // não olha o conteudo
		
		System.out.println("2".equals(s1)); // compara olhando o conteudo
	}
}
