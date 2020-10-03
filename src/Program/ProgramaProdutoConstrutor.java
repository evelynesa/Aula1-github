package Program;

import java.util.Scanner;
import Entities.ProdutoConstrutor;

public class ProgramaProdutoConstrutor {
		public static void main(String[] args) {
			
			Scanner dadosProduto = new Scanner(System.in);
						
			System.out.println("Digite os dados do Produto : ");
			
			System.out.print("Nome : ");
			String nmProduto = dadosProduto.nextLine();
			
			System.out.print("Valor Unitário : ");
			double vlUnitario = dadosProduto.nextDouble();
			
			System.out.print("Quantidade em Estoque : ");
			int qtdEstoque = dadosProduto.nextInt();		
			
			ProdutoConstrutor produto = new ProdutoConstrutor(nmProduto, vlUnitario, qtdEstoque);
			
			System.out.print("Digite a quantidade de produtos a serem Adicionados no Estoque : ");
			produto.adicionaProdutos(dadosProduto.nextInt());
			
			System.out.print("Digite a quantidade de produtos a serem Removidos do Estoque : ");
			produto.removeProdutos(dadosProduto.nextInt());
			
			System.out.println();
			System.out.println(produto.toString());
			
			dadosProduto.close();

		}
}
