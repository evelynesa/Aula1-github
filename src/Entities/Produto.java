package Entities;

public class Produto {
	private String nmProduto;
	private double vlProduto;
	private int qtdProdutoEstoque;

	public void adicionaProdutos(int qtdEntradaProdutos) {
		calculaTotalValoresEstoque(this.qtdProdutoEstoque += qtdEntradaProdutos);
	}

	public void removeProdutos(int qtdSaidaProdutos) {
		calculaTotalValoresEstoque(this.qtdProdutoEstoque -= qtdSaidaProdutos);
	}

	public double calculaTotalValoresEstoque(int qtdProdutosEstoque) {
		return vlProduto * qtdProdutosEstoque;

		/*
		 * System.out.println("Operação Efetuada com Sucesso!" );
		 * 
		 * System.out.println("\n**************** Estoque Atualizado **************** "
		 * ); System.out.println("Produto: "+this.nmProduto);
		 * System.out.println("Valor Unitário: "+this.vlProduto);
		 * System.out.println("Quantidade de Produtos em Estoque: "+this.
		 * qtdProdutoEstoque);
		 * System.out.println("Valor Total em Estoque: "+valorEstoqueAtual);
		 */
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}

	public double getVlProduto() {
		return vlProduto;
	}

	public void setVlProduto(double vlProduto) {
		this.vlProduto = vlProduto;
	}

	public int getQtdProdutoEstoque() {
		return qtdProdutoEstoque;
	}

	public void setQtdProdutoEstoque(int qtdProdutoEstoque) {
		this.qtdProdutoEstoque = qtdProdutoEstoque;
	}

	public String toString() {

		return "Produto: " + nmProduto 
				+ ", Valor Unitário: R$ " + String.format("%.2f", getVlProduto()) 
				+ " Quantidade: " + getQtdProdutoEstoque() 
				+ " Valor Total em Estoque: R$ " + String.format("%.2f",calculaTotalValoresEstoque(getQtdProdutoEstoque()));
	}
}
