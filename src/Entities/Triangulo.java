package Entities;

public class Triangulo {
	
	/*public double ladoA;
	public double ladoB;
	public double ladoC;*/
	
	public double calculaAreaTriangulo(double ladoA, double ladoB, double ladoC) {
		double valorP;
		valorP = ((ladoA + ladoB + ladoC)/2);
		return Math.sqrt(valorP*(valorP-ladoA)*(valorP-ladoB)*(valorP-ladoC));
	}
	
	
}

