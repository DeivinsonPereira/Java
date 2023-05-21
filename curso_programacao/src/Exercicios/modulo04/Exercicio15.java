package Exercicios.modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double N, n1, n2, n3;
		
		System.out.print("Quantos casos você vai digitar? ");
		N = entrada.nextDouble();
		for (int i = 0; i < N; i++) {
			System.out.println("Digite tres Numeros");
			n1 = entrada.nextDouble();
			n2 = entrada.nextDouble();
			n3 = entrada.nextDouble();
			double soma1, soma2, soma3;
			soma1 = n1 * 2;
			soma2 = n2 * 3;
			soma3 = n3 * 5;
			double media = ( soma1 + soma2 + soma3) / 10;
			System.out.printf("MEDIA = %.1f%n", media);
			
		}
		
		
		
		
		entrada.close();
	}
}
