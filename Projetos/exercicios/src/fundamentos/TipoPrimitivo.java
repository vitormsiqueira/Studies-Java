package fundamentos;



public class TipoPrimitivo {
	
	public static void main(String[] args) {
		// informacoes do funcionario
		
		// tipos numericos inteiros
		byte anosEmpresa = 23;
		short numeroVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L; // O L no final do valor indica que o valor inteiro é do tipo long
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipos booleanos
		boolean estaDeFerias = false;
		
		// Tipo caractere
		char status = 'A'; // Ativo
		
		// Dias de empresa
		System.out.println(anosEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numeroVoos / 2);
		
		// Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}
