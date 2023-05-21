package Exercicios.modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		double N, n1, n2;
		System.out.print("Quantos casos você vai digitar? ");
		N = entrada.nextInt();
		double divisor;
		for (int i = 0; i < N; i++) {
			System.out.print("Entre com o numerador: ");
			n1 = entrada.nextInt();
			System.out.print("Entre com o denominador: ");
			n2 = entrada.nextInt();
			if(n2 == 0) {
				System.out.println("DIVISÃO IMPOSSIVEL!");				
			}else {
				divisor = n1 /n2;
				System.out.printf("%.2f%n",divisor);
			}
		}
		
		
		
		
		entrada.close();
	}
}
