package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		int minutos;
		double pagar;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = entrada.nextInt();
		
		if(minutos <= 100) {
			pagar = 50.00;
		}else {
			pagar = 50.00 + ((minutos - 100) * 2);
		}
		System.out.println(pagar);
		
		entrada.close();
	}
}
