package Exercicios.modulo12.exercicio05.entities;

import Exercicios.modulo12.exercicio05.entities.enums.Color;

public class Rectangle extends Shape {

	private double width;
	private double height;

	public Rectangle() {
		super();
	}

	public Rectangle(Color color, double width, double height) {
		super(color);
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}

	
}
