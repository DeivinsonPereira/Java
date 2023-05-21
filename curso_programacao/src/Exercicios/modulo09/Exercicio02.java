package Exercicios.modulo09;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual a ordem da matriz? ");
		int n = entrada.nextInt();
		
		int[][] elemento = new int[n][n];
		
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				System.out.print("Elemento [" + i + "," + j+"]: ");
				elemento[i][j] = entrada.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL: ");
		for (int i = 0; i < elemento.length; i++) {
			System.out.print(elemento[i][i] + " ");
			
		}
		
		int negativos = 0;
		for (int i = 0; i < elemento.length; i++) {
			for (int j = 0; j < elemento[i].length; j++) {
				if(elemento[i][j] < 0) {
					negativos ++;
					
				}
			}
		}
		System.out.println();
		System.out.print("QUANTIDADE DE NEGATIVOS = " + negativos);
		
		
		entrada.close();
	}
}
