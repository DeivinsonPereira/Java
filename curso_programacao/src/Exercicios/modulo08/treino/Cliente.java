package Exercicios.modulo08.treino;

public class Cliente {

	private String nome;
	private Integer codigo;
	private Double compra;
	
	
	
	public Cliente(String nome, Integer codigo, Double compra) {
		this.nome = nome;
		this.codigo = codigo;
		this.compra = compra;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public Double getCompra() {
		return compra;
	}
	public void setCompra(Double compra) {
		this.compra = compra;
	}
	
	
	public void comprarMais(double valor) {
		compra += valor;
	}
	
	@Override
	public String toString() {
		return nome + ", " + codigo + ", " + String.format("%.2f%n", compra);
	}
	
	
}
