package Program;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.print("Digite a ordem da Matriz: ");
		int tamMat = sc.nextInt();
		sc.nextLine();
		
		//criando a matriz:
		int[][] matr = new int [tamMat][tamMat];		
		for (int i=0; i<matr.length; i++) {
			for(int j=0; j<matr[i].length; j++) {
				//populando a matriz:
				System.out.print("Digite o próximo número da Matriz Posicao "+i +" " +j +": ");
				matr[i][j] = sc.nextInt();
			}
		}
		
		//lendo a matriz
		String diagonalPrincipal = "";
		for(int i=0; i<matr.length;i++) {
			for(int j=0; j<matr[i].length; j++) {
				if(i==j) {
					diagonalPrincipal += " " +matr[i][j];
				}
			}
			
		}
		System.out.println("Diagonal Principal da Matriz: "+diagonalPrincipal);
		
		int contador = 0;
		for(int i=0; i<matr.length;i++) {
			for(int j=0; j<matr[i].length; j++) {
				if(matr[i][j]<0) {
					contador++;
				}
			}
			
		}
		System.out.println("Quantidade de números negativos: "+contador);
		sc.close();

	}

}
