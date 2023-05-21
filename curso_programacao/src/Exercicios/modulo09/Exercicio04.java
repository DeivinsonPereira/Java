package Exercicios.modulo09;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Qual a quantidade de linhas da matriz? ");
		int linha = entrada.nextInt();
		System.out.print("Qual a quantidade de linhas da matriz? ");
		int coluna = entrada.nextInt();

		System.out.println();
		System.out.println("-----------------");
		System.out.println();

		int[][] matriz = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				matriz[i][j] = entrada.nextInt();
			}
		}

		System.out.println();
		System.out.println("-------------------");
		System.out.println();

		System.out.println("VALORES NEGATIVOS:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					System.out.print("[" + matriz[i][j] + "] ");
				}
			}
		}
		System.out.println();
		System.out.println("-------------");
		System.out.println();
		System.out.println("Fim do programa!");

		entrada.close();
	}
}
