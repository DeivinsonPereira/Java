package Exercicios.modulo06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		System.out.print("Qual o valor do dolar? ");
		double vd = entrada.nextDouble();
		System.out.print("Quantos dólares serão comprados? ");
		double qdc = entrada.nextDouble();
		double res = Exercicio04Cambio.troca(vd, qdc);
		
		System.out.printf("Valor a ser pago em reais = %.2f",res);
		
		
		
		entrada.close();
	}
}
