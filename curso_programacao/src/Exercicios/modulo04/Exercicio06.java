package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int x = 1;
		int y = 1;
		
		while (x != 0 && y != 0) {
			System.out.println("Digite os valores das coordenadas X e Y: ");
			x = entrada.nextInt();
			y = entrada.nextInt();
			if(x > 0 && y > 0) {
				System.out.println("QUADRANTE Q1");
			}else if(x < 0 && y > 0) {
				System.out.println("QUADRANTE Q2");
			}else if(x < 0 && y < 0) {
				System.out.println("QUADRANTE Q3");
			}else if(x > 0 && y < 0) {
				System.out.println("QUADRANTE Q4");
			}
			
		}
		
		
		
		
		entrada.close();
	}
}
