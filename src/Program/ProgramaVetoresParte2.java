package Program;

import java.util.Scanner;

import Entities.VetoresParte2;

public class ProgramaVetoresParte2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double media = 0;
		
		System.out.print("Digite a quantidade de produtos: ");
		int qtdProdutos = sc.nextInt();
		
		VetoresParte2[] produtos = new VetoresParte2[qtdProdutos];
		
		for (int i=0; i<qtdProdutos; i++) {
			sc.nextLine();
			System.out.print("Digite o nome do Produto: ");
			String nmProduto = sc.nextLine();
			
			System.out.print("Digite o valor do Produto: ");
			double vlProduto = sc.nextDouble();
			
			produtos[i] = new VetoresParte2(vlProduto, nmProduto);
		}
		
		for (int j=0; j<produtos.length ; j++) {
			media += produtos[j].getVlProduto();
		}
		
		for (int k=0; k<produtos.length; k++) {
			System.out.println(produtos[k].toString());
		}
		System.out.println("\n Média de Produtos: "+media/produtos.length);
		sc.close();
	}

}
