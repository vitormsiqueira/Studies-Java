package classe;

public class Data {
	int dia;
	int mes;
	int ano;
	
	// Construtor explicito
//	Data(int diaInicial, int mesInicial, int anoInicial){
//		dia = diaInicial;
//		mes = mesInicial;
//		ano = anoInicial;
//	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	// Construtor padrão
	Data(){
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
		
		// byte, short, int, long -> 0
		// float, double -> 0.0
		// boolean -> false
		// char -> '\u0000'
		// object -> null
	}
	
	String dataFormatada() {
		
		String diaF = dia > 9 ? Integer.toString(dia) : 0+Integer.toString(dia);
		String mesF = mes > 9 ? Integer.toString(mes) : 0+Integer.toString(mes);
		return diaF+"/"+mesF+"/"+ano;
//		return String.format("%d/%d/%d", diaF, mes, ano); 
	}
	
	void imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
}
