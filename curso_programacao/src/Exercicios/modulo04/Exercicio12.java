package Exercicios.modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o valor de X: ");
		int x = entrada.nextInt();
		for (int i = 1; i <= x; i++) {
			if(i % 2 != 0 ) {
				System.out.println(i);
			}
		}
		
		
		
		entrada.close();
	}
}
