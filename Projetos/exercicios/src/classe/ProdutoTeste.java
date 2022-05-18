package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 4356.89);
				
		var p2 = new Produto();
		p2.nome = "Caneta preta";
		p2.preco = 2.56;
		
		
		// Define o valor do desconto para todas as instâncias
		Produto.desconto = 0.29;
		
		double precoFinal1 = p1.precoComDesconto(0.1);
		double precoFinal2 = p2.precoComDesconto();
		double mediaCarrinho = (precoFinal1 + precoFinal2)/2;
		
		System.out.println(p1.nome);
		
		System.out.printf("Média do carrinho R$%.2f.", mediaCarrinho);


		// Exemplo de atribuição por referência
//		p2 = p1;
//		
//		p2.nome = "novo valor";
//		
//		System.out.println(p2.nome);
//		System.out.println(p1.nome);

	
	
	}
}
