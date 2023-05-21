package Exercicios.modulo12.exercicio05.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicios.modulo12.exercicio05.entities.Circle;
import Exercicios.modulo12.exercicio05.entities.Rectangle;
import Exercicios.modulo12.exercicio05.entities.Shape;
import Exercicios.modulo12.exercicio05.entities.enums.Color;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);

		System.out.print("Enter the number of shapes: ");
		int n = entrada.nextInt();

		System.out.println();
		System.out.println("-----------");
		System.out.println();
		
		
		List<Shape> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Shape #" + (i + 1) + " data:");
			System.out.print("Retangle or Circle (r/c)? ");
			char retOrCirc = entrada.next().charAt(0);
			if (retOrCirc == 'r') {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = entrada.next();
				System.out.print("Width: ");
				double width = entrada.nextDouble();
				System.out.print("Height: ");
				double height = entrada.nextDouble();

				list.add(new Rectangle(Color.valueOf(color), width, height));

			} else {
				System.out.print("Color (BLACK/BLUE/RED): ");
				String color = entrada.next();
				System.out.print("Radius: ");
				double radius = entrada.nextDouble();
				
				list.add(new Circle(Color.valueOf(color), radius));
			}
			System.out.println();
			System.out.println("-----------");
			System.out.println();
		}

		System.out.println("SHAPE AREAS:");
		for (Shape s : list) {
			System.out.println(String.format("%.2f", s.area()));
		}
		
		
		entrada.close();
	}
}
