package Exercicios.modulo09;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a ordem da matriz? ");
		int ordem = entrada.nextInt();
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		int[][] matriz = new int[ordem][ordem];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "] : " );
				matriz[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("---------------");
		System.out.println();
		
		System.out.println("MAIOR ELEMENTO DE CADA LINHA: ");
		
		int[] maiorLinha = new int[ordem];
		int maior;
		for (int i = 0; i < matriz.length; i++) {
			maior = matriz[i][0];
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] > maior) {
					maior = matriz[i][j];
				}
			}
			maiorLinha[i] = maior;
		}
		
		for (int i = 0; i < ordem; i++) {
			System.out.println(maiorLinha[i]);
		}
		
		entrada.close();
	
	}
}
