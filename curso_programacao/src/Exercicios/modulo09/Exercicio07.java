package Exercicios.modulo09;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Qual a ordem da matriz? ");
		int n = entrada.nextInt();
		
		int [][] elemento = new int[n][n];
		
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
		
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				elemento[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("----------------");
		System.out.println();
		
		int somaAcima= 0;
		int somaAbaixo = 0;
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 1; j < elemento[i].length; j++) {
				if(i < j) {
					somaAcima += elemento[i][j];
				}
			}
		}
		
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				if(i > j) {
					somaAbaixo += elemento[i][j];
				}
			}
		}
		
		System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d%n",somaAcima);
		System.out.printf("SOMA DOS ELEMENTOS ABAIXO DA DIAGONAL PRINCIPAL = %d%n",somaAbaixo);
		entrada.close();
	}
}
