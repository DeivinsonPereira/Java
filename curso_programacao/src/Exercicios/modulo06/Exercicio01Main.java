package Exercicios.modulo06;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		Exercicio01Retangulo a = new Exercicio01Retangulo();
		
		
		System.out.println("Entre com a largura e altura do retângulo? ");
		a.width = entrada.nextDouble();
		a.height = entrada.nextDouble();
		
		System.out.printf("AREA = %.2f%n", a.area());
		System.out.printf("PERIMETRO = %.2f%n", a.perimeter());
		System.out.printf("DIAGONAL = %.2f", a.diagonal());
		
		
		entrada.close();
	}
}
