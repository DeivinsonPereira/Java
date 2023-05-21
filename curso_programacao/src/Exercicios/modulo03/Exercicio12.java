package Exercicios.modulo03;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Hora inicial: ");
		int horaIni = entrada.nextInt();
		System.out.println("Hora final: ");
		int horaFim = entrada.nextInt();
		
		if(horaIni < horaFim) {
			System.out.printf("O JOGO DUROU %d HORA(S)", horaFim-horaIni);
		}else {
			System.out.printf("O JOGO DUROU %d HORA(S)\n", 24 - (horaIni - horaFim));
		}
		
		
		entrada.close();
		
	}
}
