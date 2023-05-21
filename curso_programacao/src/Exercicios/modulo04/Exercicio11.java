package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int n1, n2;
		int soma = 0;
		
		
		System.out.println("Digite dois números: ");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();

		if (n1 < n2) {
			for (int i = n1 + 1; i < n2; i++) {
				if (i % 2 == 1) {
					soma += i;
				}
			}
		}
		if (n2 < n1) {
			for (int i = n2 + 1; i < n1; i++) {
				if (i % 2 != 0) {
					soma += i;
				}
			}
		}
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		entrada.close();
	}
}
