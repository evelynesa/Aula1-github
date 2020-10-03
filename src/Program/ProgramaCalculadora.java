package Program;

import java.util.Scanner;

import Entities.Calculadora;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.print("Digite o valor do Raio: ");
		double vlRaio = sc.nextDouble();
		
		System.out.println();
		System.out.println("Valor da Cincunferência : "
		+String.format("%.2f", Calculadora.calculaCircunferencia(vlRaio)));
		
		System.out.println();
		System.out.println("Valor do Volume "
		+String.format("%.2f",Calculadora.calculaVolume(vlRaio)));
	
		sc.close();
	}

}
