package Exercicios.modulo15.exercicio03.model.services;

public interface OnlinePaymentService {

	public double paymentFee(double amount);
	public double interest(double amount, int months);
}
