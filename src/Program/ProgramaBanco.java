package Program;

import java.util.Scanner;

import Entities.Banco;

public class ProgramaBanco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double vlDepInicial = 0;
		
		System.out.print("Digite o nome do Titular da Conta: ");
		String nmCliente = sc.nextLine();
		
		System.out.print("Você fará algum depósito inicial ? S/N ");
		String flagDepInicial = sc.nextLine();
		
		if (flagDepInicial.equals("S")) {
			System.out.print("Digite o valor do Depósito: ");
			vlDepInicial = sc.nextDouble();
		} else if(flagDepInicial.equals("N")) {
			vlDepInicial = 0;
		}else {
			System.out.println("Opção Inválida!");
			System.out.println("Por favor, digite S para efetuar um depósito ou N para prosseguir.");
		}
		
		Banco banco = new Banco(vlDepInicial, nmCliente);
		banco.deposito(vlDepInicial);
		System.out.println();
		System.out.println(banco.toString());
		
		System.out.println();
		System.out.print("Digite o valor do Saque: ");
		banco.saque(sc.nextDouble());
		
		System.out.println(banco.toString());
		System.out.println();
		sc.close();

	}

}
