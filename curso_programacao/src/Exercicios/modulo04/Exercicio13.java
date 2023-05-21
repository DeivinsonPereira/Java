package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n, x;
		int dentro = 0;
		int fora = 0;
		System.out.print("Quantos números você vai digitar?");
		n = entrada.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um número: ");
			x = entrada.nextInt();
			if(x >= 10 && x <= 20) {
				dentro ++;
			}else {
				fora ++;
			}
		}
		System.out.println(dentro + "DENTRO");
		System.out.println(fora + "FORA");
		
		
		entrada.close();
	}
}
