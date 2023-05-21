package Exercicios.modulo12.exercicio05.entities;

import Exercicios.modulo12.exercicio05.entities.enums.Color;

public class Circle extends Shape {

	private double radius;

	
	public Circle() {
		super();
	}
	

	public Circle(Color color, double radius) {
		super(color);
		this.radius = radius;
	}


	@Override
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}
}
