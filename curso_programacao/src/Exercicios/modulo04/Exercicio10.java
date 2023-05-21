package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int tabuada, num;
		System.out.print("Deseja a tabuada para qual valor?");
		num = entrada.nextInt();
		
		
		for (int i = 1; i < 11; i++) {
			tabuada = num * i;
			System.out.println(num + " x " + i + " = " + tabuada);
		}
		
		
		
		
		
		entrada.close();
	}
}
