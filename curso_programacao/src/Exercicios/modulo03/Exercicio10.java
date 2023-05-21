package Exercicios.modulo03;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2;
		System.out.println("Digite dois numeros inteiros: ");
		n1 = entrada.nextInt();
		n2 = entrada.nextInt();		
		
		
		
		if(n1 % n2 == 0 || n2 % n1 == 0) {
			System.out.println("São Multiplos");
		}else {
			System.out.println("Não são multiplos");
		}
		
		
		entrada.close();
	}
}
