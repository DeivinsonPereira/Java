package Exercicios.modulo02;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioFixacaoTres {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double base, altura;
		System.out.print("Base do retangulo: ");
		base = entrada.nextDouble();
		System.out.print("Altura do retangulo: ");
		altura = entrada.nextDouble();
		
		double area, perimetro, diagonal;
		
		area = base * altura;
		perimetro = (base + altura) * 2.0;
		diagonal = Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
		
		System.out.printf("AREA: %.4f%n", area);
		System.out.printf("PERÍMETRO: %.4f%n", perimetro);
		System.out.printf("DIAGONAL: %.4f%n", diagonal);
		
		entrada.close();
	}
}
