package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos numeros você vai digitar? ");
		int num = entrada.nextInt();
		entrada.nextLine();
		double[] N = new double[num];
		double soma = 0.0;
		for (int i = 0; i < N.length; i++) {
			System.out.print("Digite um número: ");
			N[i] = entrada.nextDouble();
			soma += N[i];
		}
		System.out.println();
		System.out.print("Valores: ");
		for (int i = 0; i < N.length; i++) {
			System.out.print(N[i] + " ");
		}
		System.out.println();
		
		System.out.printf("SOMA: %.2f%n", soma);
		System.out.printf("MEDIA: %.2f", soma / num);
		
		
		
		entrada.close();
	}
}
