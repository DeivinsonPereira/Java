package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int num = 0;
		double totnum = 0;
		int totdig = 0;
		System.out.println("Digite as idades");
		num = entrada.nextInt();
		if(num < 0) {
			System.out.println("Impossível Calcular!");
		}else {
			while(num >= 0) {
				totnum += num;
				num = entrada.nextInt();
				totdig ++;
			}
			double media = totnum / totdig;
			System.out.printf("MEDIA: %.2f", media);
		}
		
		
		
		
		
		entrada.close();
	}
}
