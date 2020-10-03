package Program;

import java.util.Scanner;

import Entities.Produto;

public class ProgramaProduto {

	public static void main(String[] args) {
		
		Scanner dadosProduto = new Scanner(System.in);
		Produto produto = new Produto();
		
		System.out.println("Digite os dados do Produto : ");
		
		System.out.print("Nome : ");
		produto.setNmProduto(dadosProduto.nextLine());
		
		System.out.print("Valor Unitário : ");
		produto.setVlProduto(dadosProduto.nextDouble());
		
		System.out.print("Quantidade em Estoque : ");
		produto.setQtdProdutoEstoque(dadosProduto.nextInt());		
		
		System.out.print("Digite a quantidade de produtos a serem Adicionados no Estoque : ");
		produto.adicionaProdutos(dadosProduto.nextInt());
		
		System.out.print("Digite a quantidade de produtos a serem Removidos do Estoque : ");
		produto.removeProdutos(dadosProduto.nextInt());
		
		System.out.println();
		System.out.println(produto.toString());
		
		dadosProduto.close();

	}

}
