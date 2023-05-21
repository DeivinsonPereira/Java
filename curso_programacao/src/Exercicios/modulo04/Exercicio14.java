package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio14 {
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int N,sit;
		System.out.print("Quantos números você vai digitar? ");
		N = entrada.nextInt();
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			sit = entrada.nextInt();
			if(sit % 2 == 0 && sit > 0) {
				System.out.println("PAR POSITIVO");
			}else if(sit % 2 == 0 && sit < 0) {
				System.out.println("PAR NEGATIVO");
			}else if(sit % 2 != 0 && sit > 0) {
				System.out.println("IMPAR POSITIVO");
			}else if(sit % 2 != 0 && sit < 0) {
				System.out.println("IMPAR NEGATIVO");
			}else if(sit == 0) {
				System.out.println("NULO");
			}
			
		}
		
		
		
		
		
		
		entrada.close();
	}
}
