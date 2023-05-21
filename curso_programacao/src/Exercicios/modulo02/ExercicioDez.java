package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioDez {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double A, B, C;
		
		System.out.print("Digite a medida de A: ");
		A = entrada.nextDouble();
		System.out.print("Digite a medida de B: ");
		B = entrada.nextDouble();
		System.out.print("Digite a medida de c: ");
		C = entrada.nextDouble();
		
		double quadrado, triangulo, trapezio;
		
		quadrado = Math.pow(A, 2);
		triangulo = A * B / 2;
		trapezio = (A + B )/ 2 * C;
		
		System.out.printf("AREA DO QUADRADO = %.4f%n",quadrado);
		System.out.printf("AREA DO TRIANGULO = %.4f%n",triangulo);
		System.out.printf("AREA DO TRAPEZIO = %.4f%n",trapezio);
		
		entrada.close();
	}
}
