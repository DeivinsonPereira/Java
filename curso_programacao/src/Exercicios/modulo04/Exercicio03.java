package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 0;
		int y = 1;
		while (x != y) {
			System.out.println("Digite dois numeros: ");
			x = entrada.nextInt();
			y = entrada.nextInt();
			if(x > y) {
				System.out.println("DECRESCENTE!");
			}else if(y > x) {
				System.out.println("CRESCENTE!");
			}
		}
		
		
		
		
		entrada.close();
	}
}
