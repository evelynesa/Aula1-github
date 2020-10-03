package Entities;

public class VetoresParte2 {
	
	double vlProduto;
	String nmProduto;
	
	public VetoresParte2(double vlProduto, String nmProduto) {
		this.vlProduto = vlProduto;
		this.nmProduto = nmProduto;
	}

	public double getVlProduto() {
		return vlProduto;
	}

	public void setVlProduto(double vlProduto) {
		this.vlProduto = vlProduto;
	}

	public String getNmProduto() {
		return nmProduto;
	}

	public void setNmProduto(String nmProduto) {
		this.nmProduto = nmProduto;
	}
	
	public String toString() {
		return "Dados do Produto : "
				+ "\n Produto : "+this.nmProduto
				+ "\n Valor do Produto : "+this.vlProduto;
	}
	
}
