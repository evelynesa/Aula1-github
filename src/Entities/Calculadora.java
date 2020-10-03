package Entities;

public class Calculadora {

	public static final double PI = 3.15159;

	public static double calculaCircunferencia(double vlRaio) {
		return 2 * PI * vlRaio;
	}

	public static double calculaVolume(double vlRaio) {
		return (4 * PI * Math.cbrt(vlRaio)) / 3;
	}
	
	public static String resultadoCalculadora() {
		return "Valor do Raio : "
				+"/n ";
	}
	
}
