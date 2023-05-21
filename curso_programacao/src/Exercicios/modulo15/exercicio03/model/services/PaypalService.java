package Exercicios.modulo15.exercicio03.model.services;

public class PaypalService implements OnlinePaymentService{

	public double paymentFee(double amount) {
		return amount + amount * 0.02;
	}

	public double interest(double amount, int months) {
		double aux = amount + (amount * 0.01) * months;
		return paymentFee(aux);
	}

	
}
