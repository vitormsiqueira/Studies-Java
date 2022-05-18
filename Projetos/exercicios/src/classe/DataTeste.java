package classe;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		
		d1.ano = 2022;
		d1.mes = 4;
		d1.dia = 4;
		
		Data d2 = new Data(3,3,2021);
		
		String dataFormata = d1.dataFormatada();
		
		System.out.printf(dataFormata+'\n');
		
		d1.imprimirDataFormatada();
		
		System.out.println(d2.dataFormatada());
	} 
}
