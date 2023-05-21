package Exercicios.modulo08;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantos elementos vai ter o vetor? ");
		int quantidade = entrada.nextInt();
		double[] numeros = new double[quantidade];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite um número: ");
			numeros[i] = entrada.nextDouble();

		}

		double soma = 0;

		for (int i = 0; i < numeros.length; i++) {
			soma += numeros[i];
		}

		double media = soma / quantidade;

		System.out.printf("\nMEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] < media) {
				System.out.println(numeros[i]);
			}
		}

		entrada.close();
	}
}
