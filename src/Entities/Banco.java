package Entities;

import java.util.Random;

public class Banco {
	private int numConta;
	private double vlDepositoInicial;
	private double vlSaldo = 0;
	private String nmTitular;
	private String flgDepInicial;
	Random geraNumConta = new Random();

	public double getVlSaldo() {
		return vlSaldo;
	}

	public int getNumConta() {
		return numConta;
	}

	private void setNumConta() {
		this.numConta = geraNumConta.nextInt();
	}

	public void deposito(double vlDeposito) {
		this.vlSaldo += vlDeposito;
	}

	public void saque(double vlSaque) {
		if (vlSaque > 0) {
			this.vlSaldo -= (vlSaque + 5);
		}
	}

	public double getVlDepositoInicial() {
		return vlDepositoInicial;
	}

	public void setVlDepositoInicial(double vlDepositoInicial) {
		this.vlDepositoInicial = vlDepositoInicial;
	}

	public String getNmTitular() {
		return nmTitular;
	}

	public void setNmTitular(String nmTitular) {
		this.nmTitular = nmTitular;
	}

	public Banco(double vlDepositoInicial, String nmTitular) {
		setNumConta();
		deposito(vlDepositoInicial);
		this.nmTitular = nmTitular;
	}

	public String toString() {
		return "************ Extrato ************" + "\n Titular da Conta: " + getNmTitular()
				+ "\n Conta Corrente: 01001" + getNumConta() + "\n Saldo Atual: " + getVlSaldo()
				+ "\n*********************************";
	}
}
