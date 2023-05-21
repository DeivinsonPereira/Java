package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioSeis {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double glicose;
		System.out.print("Digite a medida da glicose: ");
		glicose = entrada.nextDouble();
		
		if(glicose <= 100) {
			System.out.print("Classificação: Normal");
		}else if( glicose >100 && glicose <= 140) {
			System.out.println("Classificação: Elevado");
		}else {
			System.out.println("Classificação: Diabetes");
		}
		
		entrada.close();
	}
}
