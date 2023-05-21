package Exercicios.modulo15.exercicio03.model.services;

import java.time.LocalDate;

import Exercicios.modulo15.exercicio03.model.entities.Contract;
import Exercicios.modulo15.exercicio03.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract(Contract contract, int months) {
		double basicValue = contract.getTotalValue() / months;
		for (int i = 1; i <= months; i++) {
			double totalValue = paymentService.interest(basicValue, i);
			LocalDate date = contract.getDate().plusMonths(i);
			contract.getInstallment().add(new Installment(date, totalValue));
		}
	}
}
