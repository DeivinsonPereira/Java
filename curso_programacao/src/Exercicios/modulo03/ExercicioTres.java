package Exercicios.modulo03;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		int valor1, valor2, valor3, menor;
		Scanner entrada = new Scanner(System.in);
		System.out.print("Primeiro valor: ");
		valor1 = entrada.nextInt();
		System.out.print("Segundo valor: ");
		valor2 = entrada.nextInt();
		System.out.print("Terceiro valor: ");
		valor3 = entrada.nextInt();
		
		menor = 0;
		
		if(menor >= valor1 || menor == 0) {
			menor = valor1;
		}
		if(menor >= valor2 || menor == 0) {
			menor = valor2;	
		}
		if(menor >= valor3 || menor == 0){
			menor = valor3;
		}
		
		System.out.println("MENOR = " + menor);
		
		
		
		entrada.close();
	}
}
