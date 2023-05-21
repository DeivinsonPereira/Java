package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor do raio do circulo: ");
		double raio = entrada.nextDouble();
		
		double area = Math.PI * Math.pow(raio, 2);
		
		System.out.printf("AREA: %.3f",area);
		
		entrada.close();
	}
}
