package Exercicios.modulo09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = entrada.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		int coluna = entrada.nextInt();

		double[][] elemento = new double[linha][coluna];
		double[] vetor = new double[linha];

		for (int i = 0; i < elemento.length; i++) {
			System.out.println("Digite os elementos da " + (i + 1) + "ª . linha:");
			for (int j = 0; j < elemento[i].length; j++) {
				elemento[i][j] = entrada.nextDouble();
			}
		}

		System.out.println("VETOR GERADO:");
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				vetor[i] += elemento[i][j];
			}
			System.out.println(vetor[i]);
		}

		entrada.close();
	}
}
