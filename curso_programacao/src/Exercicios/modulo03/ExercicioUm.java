package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite a primeira nota: ");
		double nota1 = entrada.nextDouble();
		System.out.print("Digite a segunda nota: ");
		double nota2 = entrada.nextDouble();
		
		double notatotal = nota1 + nota2;
		System.out.println("NOTA FINAL = " + notatotal);
		if(notatotal < 60.00 ) {
			System.out.println("REPROVADO");
		}
		
		
		entrada.close();
		
	}
}
