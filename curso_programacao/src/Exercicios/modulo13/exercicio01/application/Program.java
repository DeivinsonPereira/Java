package Exercicios.modulo13.exercicio01.application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		method1();

		System.out.println("End of program!");

		
	}
	
	public static void method1() {
		System.out.println("*** METHOD1 START ****");
		method2();
		System.out.println("*** METHOD1 END ****");
		
	}
	public static void method2() {
		System.out.println("*** METHOD2 START ****");
		Scanner entrada = new Scanner(System.in);

		try {
			String[] vect = entrada.nextLine().split(" ");
			int position = entrada.nextInt();
			System.out.println(vect[position]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid position");
			//printStackTrace mostra o caminho da excessão.
			e.printStackTrace();
			entrada.next();
		} catch (InputMismatchException e) {
			System.out.println("Invalid Number!");
		}
		entrada.close();
		System.out.println("*** METHOD2 END ****");
	}

}
