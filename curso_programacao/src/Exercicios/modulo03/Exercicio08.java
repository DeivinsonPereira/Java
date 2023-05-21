package Exercicios.modulo03;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		char tipo;
		double temp, transformado = 0;
		String modalidade = null;
		System.out.print("Você vai digitar a temperatura em qual escala (C/F)?: ");
		tipo = entrada.next().charAt(0);
		
		if(tipo == 'F') {
			System.out.println("Digite a temperatura em Fahrenheit: ");
			modalidade = "Celsius";
			temp = entrada.nextDouble();
			transformado = (temp - 32) / 1.8;
				
		}
		if(tipo == 'C') {
			System.out.println("Digite a temperatura em Celcius: ");
			modalidade = "Fahrenheit";
			temp = entrada.nextDouble();
			transformado = temp * 1.8 + 32;
		}
		
		System.out.printf("Temperatura equivalente em %s: %.2f", modalidade, transformado );
		
		
		
		entrada.close();
	}
}
