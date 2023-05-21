package Exercicios.modulo04;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		double n1, n2;
		System.out.print("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		if(n1 < 0 || n1 > 10) {
			while(n1 < 0 || n1 > 10) {
				System.out.print("Valor Invalido! Tente novamente: ");
				n1= entrada.nextDouble();
			}
		}
		System.out.print("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		if(n2 < 0 || n2 > 10) {
			while(n2 < 0 || n2 > 10) {
				System.out.print("Valor Inválido! Tente novamente: ");
				n2 = entrada.nextDouble();
			}
		}
		double media = (n1 + n2) / 2;
		
		System.out.printf("MEDIA = %.2f", media);
		
		
		entrada.close();
	};
}
