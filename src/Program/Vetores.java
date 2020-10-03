package Program;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Insira a quantidade de Pessoas : ");
		int pos = sc.nextInt();
		double total = 0;
		
		double[] vect = new double[pos];
		
		for(int i=0; i<pos; i++) {

			System.out.print("\n Digite a altura do indivíduo: ");
						
			vect[i] = sc.nextDouble();
		}
		
		for (int j=0; j<vect.length; j++) {
			total += vect[j];
		}
		
		double media = total / vect.length;
		
		System.out.println("\n Média "+String.format("%.2f",media));
		sc.close();
	}

}
