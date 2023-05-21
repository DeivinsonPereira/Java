package Exercicios.modulo06;

public class Exercicio04Cambio {

	
	public static double IOF = 0.06;
	
	public static double troca(double valorDolar, double quantidade) {
		double calc1 = quantidade * valorDolar;
		return calc1 + (calc1 * IOF);
		
	}
}
