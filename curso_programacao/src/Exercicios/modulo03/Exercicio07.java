package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double d1, d2, d3;
		System.out.println("Digite as 3 distâncias: ");
		d1 = entrada.nextDouble();
		d2 = entrada.nextDouble();
		d3 = entrada.nextDouble();
		
		double maior = 0;
		if(maior <= d1) {
			maior = d1;
		}
		if(maior <= d2) {
			maior = d2;
		}
		if(maior <= d3) {
			maior = d3;	
		}
		
		System.out.printf("MAIOR DISTÂNCIA = %.2f", maior);
		entrada.close();
	}
}
