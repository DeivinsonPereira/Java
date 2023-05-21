package Exercicios.modulo09;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Quantas linhas vai ter cada matriz? ");
		int linha = entrada.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		int coluna = entrada.nextInt();

		int[][] A = new int[linha][coluna];
		int[][] B = new int[linha][coluna];

		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("Digite os valores da matriz A:");

		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				A[i][j] = entrada.nextInt();
			}
		}
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("Digite os valores da matriz B:");
		for (int i = 0; i < B.length; i++) {
			for (int j = 0; j < B[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				B[i][j] = entrada.nextInt();
			}
		}

		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		int[][] soma = new int[linha][coluna];

		System.out.println("MATRIZ SOMA:");

		for (int i = 0; i < soma.length; i++) {
			for (int j = 0; j < soma[i].length; j++) {
				soma[i][j] = A[i][j] + B[i][j];
				System.out.print("[" + soma[i][j] + "] ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Fim do Programa!");

		entrada.close();
	}
}
