package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioNove {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Distância percorrida: ");
		int km = entrada.nextInt();
		System.out.print("Combustível gasto: ");
		double gasolina = entrada.nextDouble();
		
		var media = km / gasolina;
		
		System.out.printf("Consumo medio = %.3f",media);
		
		
		entrada.close();
	}
}
