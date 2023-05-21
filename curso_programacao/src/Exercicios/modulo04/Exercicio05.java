package Exercicios.modulo04;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int senha = 2002;
		int tentativa;
		
		System.out.print("Digite a senha:");
		tentativa = entrada.nextInt();
		while(tentativa != senha) {
			System.out.print("Senha Invalida! Tente novamente: ");
			tentativa = entrada.nextInt();
		}
		if(tentativa == senha) {
			System.out.println("Acesso permitido!");
		}
		
		
		
		
		entrada.close();
	}
}
