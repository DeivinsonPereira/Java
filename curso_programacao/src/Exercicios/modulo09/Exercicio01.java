package Exercicios.modulo09;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int n = entrada.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = entrada.nextInt();
				
			}
			
		}
		
		System.out.println("Diagonal principal");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		
		var negativos = 0;
		System.out.println();
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] < 0) {
					negativos ++;
				}
			}
		}
		
		System.out.print("numero de negativos: " + negativos);
		
		entrada.close();
	}
}
