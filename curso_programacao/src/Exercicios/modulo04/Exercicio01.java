package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int N = entrada.nextInt();
		int soma = 0;
		for (int i = 0; i < N; i++) {
			soma += entrada.nextInt();
		}
		
		System.out.println("Total: " + soma);
		
		
		
		
		
		entrada.close();
	}
}
