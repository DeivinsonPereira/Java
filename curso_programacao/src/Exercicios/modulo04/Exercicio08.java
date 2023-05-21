package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int Diesel = 0;
		int numDig = 1;
		while(numDig != 4) {
			System.out.print("Informe um codigo (1, 2, 3) ou 4 para parar:");
			numDig = entrada.nextInt();
			if(numDig == 1) {
				alcool ++;
			}else if (numDig == 2) {
				gasolina ++;
			}else if (numDig == 3) {
				Diesel ++;
			}
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + Diesel);
		
		
		
		
		
		entrada.close();
	}
}
