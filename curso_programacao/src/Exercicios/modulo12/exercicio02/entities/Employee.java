package Exercicios.modulo12.exercicio02.entities;

public class Employee {

	private String name;
	private int hours;
	private double valuePerHour;
	
	public Employee() {
	}

	public Employee(String name, int hours, double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getValuerPerHour() {
		return valuePerHour;
	}

	public void setValuerPerHour(double valuerPerHour) {
		this.valuePerHour = valuerPerHour;
	}
	
	public double payment() {
		return valuePerHour * hours;
	}
	
	
}
