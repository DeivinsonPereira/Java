package Exercicios.modulo12.exercicio06.entities;

public class Individual extends TaxPayer{

	private double healthExpenditures;

	public Individual() {
		super();
	}

	public Individual(String name, double anualIncome, double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public double getHeatlthExpenditures() {
		return healthExpenditures;
	}

	public void setHeatlthExpenditures(double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		if(super.getAnualIncome() < 20000.00) {
			return (super.getAnualIncome() * 0.15) - (healthExpenditures * 0.5);
		}else {
			return (super.getAnualIncome() * 0.25) - (healthExpenditures * 0.5);
		}
	}
	
	
}
