package Exercicios.modulo06;


public class Exercicio03Alunos {

	public String nome;
	public double nota01;
	public double nota02;
	public double nota03;
	
	
	public double media() {
		return nota01 + nota02 + nota03;
		 
	}
	
	public String situacao() {
		if(media() > 60.00) {
			return "APROVADO!";
			
		}else {
			double resto = 60.00 - media();
			return String.format("REPROVADO! %nFALTARAM %.2f PONTOS",resto);
		}
	}
}
