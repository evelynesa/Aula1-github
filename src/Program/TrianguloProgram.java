package Program;

import java.util.Scanner;
import Entities.Triangulo;

public class TrianguloProgram {

	public static void main(String[] args) {
		
		Scanner varEntrada = new Scanner(System.in);
		double ladoA, ladoB, ladoC;
		Triangulo x = new Triangulo();
	
		System.out.println("Digite a área do triangulo (3 valores) ");
		ladoA = varEntrada.nextDouble();
		ladoB = varEntrada.nextDouble();
		ladoC = varEntrada.nextDouble();
		
		System.out.println("A área do triângulo x é "+x.calculaAreaTriangulo(ladoA, ladoB, ladoC));
		
	}

}
